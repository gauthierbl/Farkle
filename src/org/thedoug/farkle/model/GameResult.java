package org.thedoug.farkle.model;

import org.thedoug.farkle.player.Player;

import java.util.Map;

public class GameResult {
    private Map<Player, Integer> scores;

    public GameResult(Map<Player, Integer> scores) {
        this.scores = scores;
    }

    public Map<Player, Integer> getScores() {
        return scores;
    }

    public Player getWinner() {
        Player winner = null;
        int highestScore = 0;
        for (Player player: scores.keySet()) {
            Integer playerScore = scores.get(player);
            if (playerScore > highestScore) {
                winner = player;
                highestScore = playerScore;
            }
        }
        return winner;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "scores=" + scores +
                '}';
    }
}
