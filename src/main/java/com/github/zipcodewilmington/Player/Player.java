package com.github.zipcodewilmington.Player;

public abstract class Player{
    String firstName;
    String lastName;
    Double balance;
    // firstName, lastName, account balance :3?

    public Player(String firstName, String lastName, Double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;

    }

    public Double getBalance(){
        return balance;
    }

    public void account() {

    }

    //abstract  any idea why abstract? What kinds of differences will there be between the different types of players?
    //uHHH lol nah it's not in the instructions. we were just super burnt out so we just did whatever the instructor todl us
    // well you can, but when you make SlotsPlayer and stuff, what wwould be different about them lol
    // p much lol unless we didn't read somethin
}
