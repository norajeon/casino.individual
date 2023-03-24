package com.github.zipcodewilmington.games.gamblingGames.slots;


import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.games.Games;
import com.github.zipcodewilmington.games.gamblingGames.GambleGames;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends Games implements GambleGames {
    private Double balance;

    String[] rand = new String[]{"cherry", "lemon", "7", "banana", "bars", "bell", "horseshoe", "orange", "grape", "pear"};

    // need to instantiate acc of casino acc into player class

    public void run() {

    }

    public SlotsGame(List<Player> players) {
        // Call the constructor of the abstract superclass
        super(players);
//        this.balance = balance;
    }
    //needs to call account balance
    //need bet method, how much to bet


    public String[] randomSlot(String[] obj) {
        String[] ans = new String[3];
        for (int i = 0; i < 3; i++) {
            ans[i] = String.valueOf(new Random().nextInt(obj.length));
        }
        return ans;
    }

    @Override
    public Double bet() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much would you like to bet?");
        Double betAmount = (double) input.nextInt();

        //make acc subtract betAmount
        return betAmount;
    }

    @Override
    public boolean payOut() {
        return false;
    }

    @Override
    public Double totalProfit() {
        return null;
    }

    @Override
    public Double totalLosses() {
        return null;
    }

    @Override
    public Double multiplier() {
        return null;
    }

    //need to be able to return an array of 3
//    public Double pullLever(String[] rand) {
//
//        Player thePlayer = this.players.get(0); // this is a single player game
//
//        CasinoAccount acc = thePlayer;
//
//        //needs to add bet amount * multiplier to current balance
//        for (int j = 0; j < rand.length; j++) {
//            if (rand[0] == rand[1] && rand[0] == rand[2] && rand[0].equals("7")) {
//                bal = bal * 10;
//            } else if (rand[0] == rand[1] && rand[0] == rand[2] && !rand[0].equals("7")) {
//                bal = bal * 3;
//            } else if (rand[0] == rand[1] || rand[0] == rand[2] || rand[1] == rand[2]) {
//                bal = bal * 2;
//            } else {
//                bal = bal - 5;
//            }
//        }
//
//        // update the player's balance
//        thePlayer.setBalance(bal);
//
//        return bal;
//    }
}
