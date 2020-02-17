package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String result = "";
        if (handSign.equals("rock")) {
            result = "paper";
        } else if (handSign.equals("paper")) {
            result = "scissors";
        } else {
            result = "rock";
        }
        return result;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String result = "";
        if (handSign.equals("paper")) {
            result = "rock";
        } else if (handSign.equals("scissors")) {
            result = "paper";
        } else {
            result = "scissor";
        }
        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String result = "";
        if (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("paper")) {
            result = handSignOfPlayer2;
        } else if (handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")) {
            result = handSignOfPlayer1;
        } else if (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissor")) {
            result = handSignOfPlayer1;
        } else if (handSignOfPlayer1.equals("scissor") && handSignOfPlayer2.equals("rock")) {
            result = handSignOfPlayer2;
        } else if (handSignOfPlayer1.equals("scissor") && handSignOfPlayer2.equals("paper")) {
            result = handSignOfPlayer1;
        } else if (handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("scissor")) {
            result = handSignOfPlayer2;
        }
        return result;
    }
}
