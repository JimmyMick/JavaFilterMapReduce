package com.apress.demo.model;

public class Record {

    private String team;
    private Integer wins;
    private Integer losses;
    private Integer ties;

    public Record(String team){
        this(team,0,0,0);
    }
    public Record(String team, Integer wins, Integer losses, Integer ties) {
        this.team = team;
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
    }

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

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = ties;
    }
}
