package com.github.zipcodewilmington.games.gamblingGames.blackJack;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.dealer.DealerNew;
import com.github.zipcodewilmington.deck.Card;

import java.util.List;

public class BlackJack {
        private DealerNew dealer;
        private List<Player> players;
        private int betAmount;

        public BlackjackGame(List<Player> players, int betAmount) {
            this.players = players;
            this.betAmount = betAmount;
            dealer = new DealerNew();
        }

        public void playGame() {
            dealer.shuffle();
            dealer.deal(players, 2);
            for (Player player : players) {
                while (player.getHandValue() < 21) {
                    System.out.println(player.getName() + "'s hand: " + player.getHand().toString());
                    String input = System.console().readLine("Hit or stand? ");
                    if (input.equalsIgnoreCase("hit")) {
                        Card card = dealer.getDeck().remove(0);
                        player.addCard(card);
                    } else {
                        break;
                    }
                }
            }
            while (dealer.getHandValue() < 17) {
                Card card = dealer.getDeck().remove(0);
                dealer.addToHand(card);
            }
            int dealerValue = dealer.getHandValue();
            System.out.println("Dealer's hand: " + dealer.getHand().toString());
            for (Player player : players) {
                int playerValue = player.getHandValue();
                if (playerValue > 21) {
                    System.out.println(player.getName() + " busts with a hand value of " + playerValue);
                } else if (dealerValue > 21) {
                    System.out.println(player.getName() + " wins with a hand value of " + playerValue);
                    player.addMoney(betAmount);
                } else if (playerValue > dealerValue) {
                    System.out.println(player.getName() + " wins with a hand value of " + playerValue);
                    player.addMoney(betAmount);
                } else if (playerValue == dealerValue) {
                    System.out.println(player.getName() + " ties with the dealer with a hand value of " + playerValue);
                } else {
                    System.out.println(player.getName() + " loses with a hand value of " + player
}
            }
        }