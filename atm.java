package com.company;

public class atm {

    int balance;

    atm(int balance){ this.balance = balance;}

    public String add_deposit(int money){
        this.balance += money;
        return ("Transaction done");
    }
    public String Receipt_Check(){
        return ("The Balance of your bank account is: " + this.balance);
    }
    public String withdraw_cash(int money){
        if (money <= this.balance) {
            this.balance -= money;
            return ("Transaction done");
        }
        else
        {
            return ("Transaction cannot be done");
        }
    }

}
