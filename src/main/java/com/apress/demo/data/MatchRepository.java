package com.apress.demo.data;

import com.apress.demo.model.Match;

import java.util.ArrayList;
import java.util.List;

public class MatchRepository {

    private List<Match> matches;

    public MatchRepository() {
        matches = new ArrayList<>();
    }

    public void addMatch(Match m){
        if(matches == null){
            matches = new ArrayList<>();
        }
        matches.add(m);
    }

    public List<Match> getMatches(){
        if(matches == null){
            matches = new ArrayList<>();
        }
        return matches;
    }

}
