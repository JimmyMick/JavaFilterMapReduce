package com.apress.demo.model;

public class Record {

    private String team;
    private Integer wins;
    private Integer loses;
    private Integer ties;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLoses() {
        return loses;
    }

    public void setLoses(Integer loses) {
        this.loses = loses;
    }

    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = ties;
    }
}
