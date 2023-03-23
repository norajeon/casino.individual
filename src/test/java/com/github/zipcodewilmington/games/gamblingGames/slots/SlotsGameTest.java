package com.github.zipcodewilmington.games.gamblingGames.slots;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {

    @Test
    public void testSlotsGame1() {
        String[] rand = new String[]{"7", "7", "7"};
        SlotsGame test = new SlotsGame();

        Double expected = test.pullLever(rand, 50.00);
        Double actual = 500.00;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSlotsGames2() {
        String[] rand = new String[]{"10", "7", "7"};
        SlotsGame test = new SlotsGame();

        Double expected = test.pullLever(rand, 50.00);
        Double actual = 100.00;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSlotsGames3() {
        String[] rand = new String[]{"10", "10", "10"};
        SlotsGame test = new SlotsGame();

        Double expected = test.pullLever(rand, 50.00);
        Double actual = 150.00;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSlotsGames4() {
        String[] rand = new String[]{"10", "3", "5", "7"};
        SlotsGame test = new SlotsGame();

        Double expected = test.pullLever(rand, 50.00);
        Double actual = 45.00;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testRandom() {
        SlotsGame test = new SlotsGame();
        String[] testing = new String[]{"hi", "oranges", "mangoes", "hello", "whatever"};

        Integer actualArr = test.randomSlot(testing).length;
        Integer actual = 3;

        Assert.assertEquals(actualArr, actual);
    }

//    @Test
//    public void testPullLever() {
//        SlotsGame test = new SlotsGame();
//
//    }


}