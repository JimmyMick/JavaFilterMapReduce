package com.apress.demo.controller;

import com.apress.demo.data.MatchRepository;
import com.apress.demo.model.Match;
import com.apress.demo.model.MatchSummary;
import com.apress.demo.model.Record;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/matches")
public class CricketController {

    private MatchRepository repo = new MatchRepository();

    @GetMapping
    public List<Match> getMatches() {
        return repo.getMatches();
    }

    //  /api/matches/New Zealand
    //  /api/matches/England
    //  /api/matches/India?opponent=Pakistan
    @GetMapping(path = "/{team}")
    public ResponseEntity<List<Match>> getTeamMatches(@PathVariable(name = "team") String team,
                                                      @RequestParam(name = "opponent", required = false) String opponent) {

        List<Match> matches = repo.getMatches().stream()
                .filter(m -> {
                    return m.getInfo().getTeams().contains(team);
                })
                .filter(m -> {
                    return opponent == null || m.getInfo().getTeams().contains(opponent);
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok()
                .header("count", String.format("%d", matches.size()))
                .body(matches);

    }

    @GetMapping(path = "/{team}/summaries")
    public ResponseEntity<List<MatchSummary>> getSummaries(@PathVariable(name = "team") String team,
                                                           @RequestParam(name = "opponent", required = false) String opponent) {

        List<MatchSummary> matches = repo.getMatches().stream()
                .filter(m -> m.getInfo().getTeams().contains(team))
                .filter(m -> opponent == null || m.getInfo().getTeams().contains(opponent))
                .peek((m) -> {
                    System.out.println(m.getInfo().getOutcome().getResult());
                })
                .map(m -> {
                    MatchSummary summary = new MatchSummary(m.getInfo().getDates().get(0),
                            m.getInfo().getCity(),
                            m.getInfo().getTeams(),
                            m.getInfo().getOutcome().getWinner());
                    return summary;
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok()
                .header("count", String.format("%d", matches.size()))
                .body(matches);
    }

    @GetMapping(path = "/{team}/record")
    public Record getWinLossRecord(@PathVariable(name = "team") String team,
                                   @RequestParam(name = "opponent", required = false) String opponent) {

        Record winLossRecord = repo.getMatches().stream()
                .filter(m -> m.getInfo().getTeams().contains(team))
                .filter(m -> opponent == null || m.getInfo().getTeams().contains(opponent))
                .filter(m -> !"no result".equalsIgnoreCase(m.getInfo().getOutcome().getResult()))
                .reduce(new Record(team),   // this object will accumulate the wins and losses.
                        (r, m) -> {         // this BiFunction takes the accumulator and the current Match in the pipe
                            if (team.equalsIgnoreCase(m.getInfo().getOutcome().getWinner())) {
                                r.setWins(r.getWins() + 1);
                            } else if ("tie".equalsIgnoreCase(m.getInfo().getOutcome().getResult())) {
                                r.setTies(r.getTies() + 1);
                            } else {
                                r.setLosses(r.getLosses() + 1);
                            }
                            return r;
                        }, (a, b) -> {  // This is a combiner used if Parrallel streams are used
                            return new Record(a.getTeam(),
                                    a.getWins() + b.getWins(),
                                    a.getLosses() + b.getLosses(),
                                    a.getTies() + b.getTies());
                        });

        return winLossRecord;
    }

    @PostMapping
    public void addMatch(@RequestBody Match match) {

        if (match != null) {
            repo.getMatches().add(match);
        }
    }

}
