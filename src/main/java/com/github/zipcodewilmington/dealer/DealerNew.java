package com.github.zipcodewilmington.dealer;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.Player.cardPlayer.CardPlayer;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.deck.Card;
import com.github.zipcodewilmington.deck.Rank;
import com.github.zipcodewilmington.deck.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class DealerNew {
        private List<Card> deck;
        private List<Card> hand;



        public DealerNew() {
            super(accounts);
            for (CasinoAccount acc : accounts) {
//            System.out.println(String.format("Creating player for %s", acc.getAccountName()));
                CardPlayer pl = new CardPlayer (acc);
                addPlayer(pl);

            deck = new ArrayList<>();
            hand = new ArrayList<>();

            // Initialize deck with all possible combinations of suit and rank
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    deck.add(new Card(rank, suit));
                }
            }
        }
        public List<Card> getDeck(){
            return deck;
        }

        public List<Card> getHand(){
            return hand;
        }

        public void shuffle() {
            Collections.shuffle(deck);
        }

        public void deal(List<Player> players, int numCards) {
            for (int i = 0; i < numCards; i++) {
                for (Player player : players) {
                    Card card = deck.remove(0);
                    player.addCard(card);
                }
                Card card = deck.remove(0);
                addToHand(card);
            }
        }

        public void addToHand(Card card) {
            hand.add(card);
        }


        public int getHandValue() {
            int value = 0;
            boolean hasAce = false;
            for (Card card : hand) {
                Rank rank = card.getRank();
                if (rank == Rank.ACE) {
                    hasAce = true;
                }
                value += rank.getValue();
            }
            if (hasAce && value + 10 <= 21) {
                value += 10;
            }
            return value;
        }
    }
}


//public double payout(double bet, double multiplier){
//        Hand = new ArrayList<>(); //initializing hand as an arraylist
//        double payout = 0;
//        int result = compareHands(Hand);
//        if (result > 0) {
//        payout = bet * multiplier;
//        } else if (result < 0){
//        payout = -bet;
//        }
//        return payout;
//        }