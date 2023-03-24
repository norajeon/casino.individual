package com.github.zipcodewilmington.deck;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RankTest {

    @Test
    public void TestKINGTitle(){
        String actual = Rank.KING.getRankTitle();
        String expected = "King";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestQUEENTitle() {
        String actual = Rank.QUEEN.getRankTitle();
        String expected = "Queen";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestJACKTitle() {
        String actual = Rank.JACK.getRankTitle();
        String expected = "Jack";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestTENTitle() {
        String actual = Rank.TEN.getRankTitle();
        String expected = "Ten";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestNINETitle() {
        String actual = Rank.NINE.getRankTitle();
        String expected = "Nine";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestEIGHTTitle() {
        String actual = Rank.EIGHT.getRankTitle();
        String expected = "Eight";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestSEVENTitle() {
        String actual = Rank.SEVEN.getRankTitle();
        String expected = "Seven";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestSIXTitle() {
        String actual = Rank.SIX.getRankTitle();
        String expected = "Six";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestFIVETitle() {
        String actual = Rank.FIVE.getRankTitle();
        String expected = "Five";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestFOURTitle() {
        String actual = Rank.FOUR.getRankTitle();
        String expected = "Four";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestTHREETitle() {
        String actual = Rank.THREE.getRankTitle();
        String expected = "Three";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestTWOTitle() {
        String actual = Rank.TWO.getRankTitle();
        String expected = "Two";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestACETitle() {
        String actual = Rank.ACE.getRankTitle();
        String expected = "Ace";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestKINGValue() {
        int actual = Rank.KING.getRankValue();
        int expected = 13;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestQUEENValue() {
        int actual = Rank.QUEEN.getRankValue();
        int expected = 12;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestJACKValue() {
        int actual = Rank.JACK.getRankValue();
        int expected = 11;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestTENValue() {
        int actual = Rank.TEN.getRankValue();
        int expected = 10;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestNINEValue() {
        int actual = Rank.NINE.getRankValue();
        int expected = 9;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestEIGHTValue() {
        int actual = Rank.EIGHT.getRankValue();
        int expected = 8;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestSEVENValue() {
        int actual = Rank.SEVEN.getRankValue();
        int expected = 7;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestSIXValue() {
        int actual = Rank.SIX.getRankValue();
        int expected = 6;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestFIVEValue() {
        int actual = Rank.FIVE.getRankValue();
        int expected = 5;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestFOURValue() {
        int actual = Rank.FOUR.getRankValue();
        int expected = 4;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestTHREEValue() {
        int actual = Rank.THREE.getRankValue();
        int expected = 3;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestTWOValue() {
        int actual = Rank.TWO.getRankValue();
        int expected = 2;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestACEValue() {
        int actual = Rank.ACE.getRankValue();
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
}