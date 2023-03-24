package com.github.zipcodewilmington.dealer;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.Player.cardPlayer.CardPlayer;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.deck.Card;
import com.github.zipcodewilmington.deck.Rank;
import com.github.zipcodewilmington.deck.Suit;
//import jdk.internal.org.jline.terminal.Terminal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Dealer extends Player { //2 instances variables deck and hand.
    private List<Card> deck; // deck is a list of Card objects that represents the deck of cards the dealer is using
    private List<Card> Hand; // hand is a list of Card objects that represent the dealers hand in the game.
    //the reason they are private is because we dont want any other class to have access to the dealers cards


    public Dealer(){
        super(accounts);
        for (CasinoAccount acc : accounts) {
//            System.out.println(String.format("Creating player for %s", acc.getAccountName()));
            CardPlayer pl = new CardPlayer (acc);
            addPlayer(pl);
        deck = new ArrayList<>(); //initializing deck as an arraylist
        Hand = new ArrayList<>(); //initializing hand as an arraylist

       for (Suit suit: Suit.values()){
           for (Rank rank : Rank.values()){
               deck.add(new Card(rank , suit));
           }
        }
    }

    public List<Card> getDeck(){
        return deck;
    }

    public List<Card> getHand(){
        return Hand;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }
    public List<Card> deal(List<Player> players) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                Card card = deck.remove(0);
                player.addCard(card);
                cards.add(card);
            }
            Hand.add(deck.remove(0));
        }
        return cards;
    }


    public void addCard(Card card) {
        Hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int aceCount = 0;
        for (Card card : Hand) {
            if (card.getRank() == Rank.ACE) {
                aceCount++;
            }
            value += card.getValue();
        }
        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }
        return value;
    }

    public void compareHands(Player player, Dealer dealer) {
        int playerValue = player.getHandValue();
        int dealerValue = getHandValue();
        if (playerValue > dealerValue) {
            player.win();
        } else if (dealerValue > playerValue) {
            player.lose();
        } else {
            player.push();
        }
    }

    public double payout(double bet, double multiplier){
        Hand = new ArrayList<>(); //initializing hand as an arraylist
        double payout = 0;
        int result = compareHands(Hand);
        if (result > 0) {
            payout = bet * multiplier;
        } else if (result < 0){
            payout = -bet;
        }
        return payout;
    }
}


