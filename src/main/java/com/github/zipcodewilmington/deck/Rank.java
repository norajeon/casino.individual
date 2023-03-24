package com.github.zipcodewilmington.deck;

public enum Rank {

    ACE("Ace", 1), TWO("Two", 2), THREE("Three", 3), FOUR("Four", 4), FIVE("Five", 5), SIX("Six", 6),
    SEVEN("Seven", 7), EIGHT("Eight", 8), NINE("Nine", 9), TEN("Ten",10), JACK("Jack",11), QUEEN("Queen",12), KING("King",13);
    String rankTitle;
    int rankValue;

    public String getRankTitle() {
        return rankTitle;
    }

    public int getRankValue() {
        return rankValue;
    }

    Rank(String rankTitle, int rankValue){
        this.rankTitle = rankTitle;
        this.rankValue = rankValue;
    }

    public int getValue() {
            switch (this) {
                case ACE:
                    return 11;
                case TWO:
                    return 2;
                case THREE:
                    return 3;
                case FOUR:
                    return 4;
                case FIVE:
                    return 5;
                case SIX:
                    return 6;
                case SEVEN:
                    return 7;
                case EIGHT:
                    return 8;
                case NINE:
                    return 9;
                default: // for TEN, JACK, QUEEN, and KING
                    return 10;
            }
        }
    }
}
