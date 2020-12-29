package com.irisida.lang.part06.projects.rockpaperscissors.application;

public enum GameObject {
    ROCK, PAPER, SCISSORS;

    private GameObject beats;
    private GameObject losesTo;

    static {
        ROCK.beats = SCISSORS;
        ROCK.losesTo = PAPER;

        PAPER.beats = ROCK;
        PAPER.losesTo = SCISSORS;

        SCISSORS.beats = PAPER;
        SCISSORS.losesTo = ROCK;
    }

    boolean beats(GameObject other) {
        return this.beats == other;
    }

    boolean losesTo(GameObject other) {
        return this.losesTo == other;
    }

}
