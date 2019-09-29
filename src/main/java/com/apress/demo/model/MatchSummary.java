package com.apress.demo.model;

import java.util.Date;
import java.util.List;

public class MatchSummary {
    private Date date;
    private String city;
    private List<String> teams;
    private String winner;

    public MatchSummary(Date date, String city, List<String> teams, String winner) {
        this.date = date;
        this.city = city;
        this.teams = teams;
        this.winner = winner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
