package com.company;
import java.time.LocalTime;

public class Digital_Watch {

    public static String show_time(){

        return "The Time at your place is " + LocalTime.now().toSecondOfDay();
    }

    public static String Set_time(String time){
        System.out.println("Please set the watch to the local time now ");
        return"Uptaded time is" + time;
    }
}
