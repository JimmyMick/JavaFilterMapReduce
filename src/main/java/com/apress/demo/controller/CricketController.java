package com.apress.demo.controller;

import com.apress.demo.data.MatchRepository;
import com.apress.demo.model.Match;
import com.apress.demo.model.MatchSummary;
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

    @PostMapping
    public void addMatch(@RequestBody Match match) {

        if (match != null) {
            repo.getMatches().add(match);
        }
    }

}
