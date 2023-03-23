package com.github.zipcodewilmington.games.gamblingGames.slots;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame {
    String[] rand = new String[]{"cherry", "lemon", "7", "banana", "bars", "bell", "horseshoe", "orange", "grape", "pear"};

    public String[] randomSlot(String[] obj) {
        String[] ans = new String[3];
        for (int i = 0; i < 3; i++) {
            ans[i] = String.valueOf(new Random().nextInt(obj.length));
        }
        return ans;
    }

    public Double pullLever(String[] rand, Double balance) {
        //need to be able to return multiplier value applied to balance maybe?
        //implement method that allows a return of 3 diff _ _ _
        Double newBalance = 0.00;
            if(rand[0] == rand[1] && rand[0] == rand[2] && rand[0].equals("7")) {
                newBalance = balance * 10;
            }
            else if (rand[0] == rand[1] && rand[0] == rand[2] && !rand[0].equals("7")){
                newBalance = balance * 3;
            }
            else if (rand[0] == rand[1] || rand[0] == rand[2] || rand[1] == rand[2]) {
                newBalance = balance * 2;
            }
            else {
                newBalance = balance - 5;
            }
            return newBalance;
        }





}
