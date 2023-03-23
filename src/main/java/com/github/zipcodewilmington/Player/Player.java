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

}
