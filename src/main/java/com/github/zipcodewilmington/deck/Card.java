package com.github.zipcodewilmington.deck;


enum Rank{
     TWO, THREE, FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE
}
enum Suit{
    HEARTS, DIAMONDS,CLUBS,SPADES
}
class Card{
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    public Rank getRank(){
        return rank;
    }
    public Suit getSuit(){
        return suit;
    }
}
