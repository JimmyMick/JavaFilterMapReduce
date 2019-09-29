package com.apress.demo.model;

import java.util.Date;
import java.util.List;

public class Info {
    private String city;
    private List<Date> dates;
    private String gender;
    private String matchType;
    private String neutral_venue;
    private Outcome outcome;
    private Integer overs;
    private List<String> player_of_match;
    private List<String> teams;
    private Toss toss;
    private List<String> umpires;
    private String venue;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getNeutral_venue() {
        return neutral_venue;
    }

    public void setNeutral_venue(String neutral_venue) {
        this.neutral_venue = neutral_venue;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public Integer getOvers() {
        return overs;
    }

    public void setOvers(Integer overs) {
        this.overs = overs;
    }

    public List<String> getPlayer_of_match() {
        return player_of_match;
    }

    public void setPlayer_of_match(List<String> player_of_match) {
        this.player_of_match = player_of_match;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public Toss getToss() {
        return toss;
    }

    public void setToss(Toss toss) {
        this.toss = toss;
    }

    public List<String> getUmpires() {
        return umpires;
    }

    public void setUmpires(List<String> umpires) {
        this.umpires = umpires;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public class Toss {
        private String decision;
        private String winner;

        public String getDecision() {
            return decision;
        }

        public void setDecision(String decision) {
            this.decision = decision;
        }

        public String getWinner() {
            return winner;
        }

        public void setWinner(String winner) {
            this.winner = winner;
        }
    }


}
