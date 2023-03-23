package com.github.zipcodewilmington.dealer;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.deck.Card;
//import jdk.internal.org.jline.terminal.Terminal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Dealer { //2 instances variables deck and hand.
    private List<Card> deck; // deck is a list of Card objects that represents the deck of cards the dealer is using
    private List<Card> hand; // hand is a list of Card objects that represent the dealers hand in the game.
    //the reason they are private is because we dont want any other class to have access to the dealers cards


    public Dealer(){
//        deck = new ArrayList<>(); //initializing deck as an arraylist
//        hand = new ArrayList<>(); //initializing hand as an arraylist
//
//
//        for (Card.getSuit() : Suit.values()){
//            for (Card.Rank rank : Rank.values()){
//                deck.add(new Card(suit, rank));
//            }
//        }
    }

    public List<Card> getDeck(){
        return deck;
    }

    public List<Card> getHand(){
        return hand;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card deal() {
        return null;
        }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int compareHand(List<Card> otherHand){ //or player2Hand or dealerHand?)
            return 0;
        }

    public double payout(double bet, double multiplier){
        double payout = 0;
        int result = compareHand(hand);
        if (result > 0) {
            payout = bet * multiplier;
        } else if (result < 0){
            payout = -bet;
        }
        return payout;
    }

    public void compareHands(Player player) {
    }
}


