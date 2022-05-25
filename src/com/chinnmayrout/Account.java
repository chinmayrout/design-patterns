package com.chinnmayrout;

public class Account {
    public float balance;

    public void deposit(float amount){
//        this.balance = this.balance + amount;
        balance += amount;     // Augmented assignment operator
    }

    public void withdraw(float amount){
        if(amount >  0)
            balance -= amount;
    }

// Using deposit and withdraw method instead of setter
//    public void setBalance(float balance){  //setter
//        if(balance > 0)
//            this.balance = balance;
//    }

    public float getBalance(){
        return balance;
    }
}
