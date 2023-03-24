package com.github.zipcodewilmington.deck;


public enum Suit {
    HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBS("Clubs"), SPADES("Spades");
    String suitTitle;

    Suit(String suitTitle) {
        this.suitTitle = suitTitle;
    }

    public String getSuit() {
        return suitTitle;
    }
}
