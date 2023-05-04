package com.github.zipcodewilmington.games.gamblingGames.slots;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {

    @Test
    public void testMaxPlayers() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("a", "a", 50.00));
        int expected = 1;
        SlotsGame a = new SlotsGame(accounts);
        int actual = a.getMaxPlayers();
        Assert.assertEquals(expected, actual);
    }

    public void testSlotsConstructor() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        SlotsGame a = new SlotsGame(accounts);
        CasinoAccount b = new CasinoAccount("a", "a", 50.00);
        accounts.add(b);


        double actual = 50.00;
        double expected = b.getAccountBalance();
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testSlotsGame1() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));

        String[] a = new String[]{"7", "7", "7"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.pullLever(10.00, a);
        Double expected = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testSlotsGames2() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "7", "7"};
        SlotsGame test = new SlotsGame(accounts);


        Double actual = test.pullLever(10.00, a);
        Double expected = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testSlotsGames3() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "10", "10"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.pullLever( 10.00, a);
        Double expected = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testSlotsGames4() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "3", "5"};
        SlotsGame test = new SlotsGame(accounts);


        Double expected = test.pullLever( 10.00, a);
        Double actual = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testPayOut() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "3", "5"};
        SlotsGame test = new SlotsGame(accounts);

        boolean actual = test.payOut();
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTotalProfit() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "3", "5"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.totalProfit();
        Double expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTotalLosses() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "3", "5"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.totalLosses();
        Double expected = null;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplier() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "3", "5"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.multiplier();
        Double expected = null;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testBet() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        SlotsGame test = new SlotsGame(accounts);
        String[] testing = new String[]{"hi", "oranges", "mangoes", "hello", "whatever"};

        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
        IOConsole con = new IOConsole(AnsiColor.BLUE, in, System.out);
        test.bet();



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