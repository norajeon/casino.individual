package com.github.zipcodewilmington.games.gamblingGames.slots;


import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.Player.SlotsPlayer;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.games.Games;
import com.github.zipcodewilmington.games.gamblingGames.GambleGames;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends Games implements GambleGames {
    IOConsole cons = new IOConsole(AnsiColor.RED);
    private Double balance;
    boolean wantToPlay = true;


    String[] symbols = new String[]{"🍒", "🍋", "7️⃣", "🍌", "🥇", "🔔", "🐴", "🍊", "🍇", "🍐"};

    int slot1;
    int slot2;
    int slot3;

    // need to instantiate acc of casino acc into player class

    public void run() {



        while(wantToPlay) {

            Double bet = bet();
            System.out.println("[ x ]  [ x ]  [ x ]");

            String ans = cons.getStringInput("Pull the lever? Y/N");
            if (ans.equals("Y")) {
                pullLever(bet, symbols);
            } else {
                break;
            }

            String symbol1 = symbols[slot1];
            String symbol2 = symbols[slot2];
            String symbol3 = symbols[slot3];

            System.out.println(String.format("[%s] [%s] [%s]", symbol1, symbol2, symbol3));

            String ans2 = cons.getStringInput("Would you like to play again? Y/N");
            if (ans2.equals("Y")) {
                wantToPlay = true;
            } else {
                wantToPlay = false;
                return;
            }


        }

    } //run

    public int getMaxPlayers() {
        return 1;
    }

    public SlotsGame(List<CasinoAccount> accounts) {
     
        super(accounts);

        // create the slots players

        for (CasinoAccount acc : accounts) {
//            System.out.println(String.format("Creating player for %s", acc.getAccountName()));
            SlotsPlayer pl = new SlotsPlayer(acc);
            addPlayer(pl);
        }
    }

    @Override
    public Double bet() {
        Double betAmount = 0.00;
        while(true) {
            betAmount = cons.getDoubleInput("How much do you want to bet? Your current amount is \n" + players.get(0).getBalance());
            if (betAmount > players.get(0).getBalance()) {
                System.out.println("You're broke. Try again.");
            }
            break;
        }
        //make acc subtract betAmount
        return betAmount;
    }



    //need to be able to return an array of 3
    public Double pullLever(Double bet, String[] s) {

//        generate random numbers for the slots
        slot1 = new Random().nextInt(s.length);
        slot2 = new Random().nextInt(s.length);
        slot3 = new Random().nextInt(s.length);

        String symbol1 = s[slot1];
        String symbol2 = s[slot2];
        String symbol3 = s[slot3];

        Double currentBalance = players.get(0).getBalance();



        if (symbol1 == symbol2 && symbol1 == symbol3) {
            if (symbol1.equals("7") || symbol1.equals("7️⃣")) {
                currentBalance += bet * 10.00;
            } else {
                currentBalance += bet * 2.00;
            }
        } else if (symbol1 == symbol2 || symbol3 == symbol2 || symbol1 == symbol3) { // two of a kind yeth YETH
            currentBalance += bet * 1.00;
        } else {
            // lose money
            currentBalance = currentBalance - bet;
        }

        // update the player's balance
        players.get(0).setBalance(currentBalance);
        return currentBalance;
    }
}
