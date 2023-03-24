package com.github.zipcodewilmington.deck;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuitTest {

    @Test
    public void TestSuitSpades(){
        String actual = Suit.SPADES.getSuit();
        String expected = "Spades";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSuitClubs(){
        String actual = Suit.CLUBS.getSuit();
        String expected = "Clubs";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSuitHearts(){
        String actual = Suit.HEARTS.getSuit();
        String expected = "Hearts";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSuitDiamonds(){
        String actual = Suit.DIAMONDS.getSuit();
        String expected = "Diamonds";

        Assert.assertEquals(actual, expected);
    }

}