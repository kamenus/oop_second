package ru.mirea.practice4;

public class MatchModel {
    int milan = 0;
    int madrid = 0;
    String last = "N/A";
    String winner = "DRAW";

    void setWinner(String winner) {
        if (this.milan > this.madrid) {
            this.winner = "AC Milan";
        }else if (this.madrid > this.milan) {
            this.winner = "Real Madrid";
        }else {
            this.winner = "DRAW";
        }
    }

    public void goalMilan() {
        this.milan++;
        this.last = "AC Milan";
        setWinner("AC Milan");
    }

    public void goalMadrid() {
        this.madrid++;
        this.last = "Real Madrid";
        setWinner("Real Madrid");
    }

    public int getMilan() {
        return milan;
    }

    public int getMadrid() {
        return madrid;
    }

    public String getLast() {
        return last;
    }

    public String getWinner() {
        return winner;
    }
}
