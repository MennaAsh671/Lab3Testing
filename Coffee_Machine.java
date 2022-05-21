package com.company;

import java.util.Scanner;

public class Coffee_Machine {
    public static String Coffee_dispenser(){
        return "Coffee dispensed successfully";
    }

    public static String collect_coins(int n){

        Scanner coins = new Scanner(System.in);

        System.out.println("Enter the coins to get the desired drink  here are the prices : \n 1)10 pounds \n 2) 20 pounds \n 3) 30 pounds");
        if (n < 5)
            return "Sorry the entered cash is not sufficient ";
        else
            return Coffee_dispenser();
    }

}