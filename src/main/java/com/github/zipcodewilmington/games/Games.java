package com.github.zipcodewilmington.games;

import com.github.zipcodewilmington.Player.Player;

import java.util.List;

public abstract class Games {
    protected List<Player> players;
    //games and subclasses can access protected

    public Games(List<Player> players) {
        this.players = players;
    }

    public void playGame() {

    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void playAgain() {

    }

    public boolean isGameOver() {
        return false;
    }
}
