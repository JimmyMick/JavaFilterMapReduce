package com.apress.demo.model;

public class Outcome {

    public class By{
        private String runs;
        private String wickets;

        public String getWickets() {
            return wickets;
        }

        public void setWickets(String wickets) {
            this.wickets = wickets;
        }

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }
    }

    private By by;
    private String bowl_out;
    private String result;
    private String winner;

    public By getBy() {
        return by;
    }

    public void setBy(By by) {
        this.by = by;
    }

    public String getBowl_out() {
        return bowl_out;
    }

    public void setBowl_out(String bowl_out) {
        this.bowl_out = bowl_out;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
