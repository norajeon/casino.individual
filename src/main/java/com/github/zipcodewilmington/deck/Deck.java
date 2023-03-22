package com.github.zipcodewilmington.deck;
import java.util.List;
import java.util.ArrayList;
class Deck {
    private List<Card> cards;
    public Deck(){
        cards = new ArrayList<>();

        for(Rank rank : Rank.values()){
            for(Suit suit : Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
    }
    public int size(){
        return cards.size();
    }
}
