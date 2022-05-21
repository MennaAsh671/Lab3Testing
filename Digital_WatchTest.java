package com.company;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
public class Digital_WatchTest {
    Digital_Watch watch = new Digital_Watch();
    @Test
    public void test1(){
        assertEquals(watch.show_time(),"The Time at your place  is " + LocalTime.now().toSecondOfDay());
    }
    @Test
    public void test2(){
        assertEquals(watch.Set_time("07:30"), "Uptaded time is 07:30");
    }
    @Test
    public void test3() {
        assertEquals(watch.show_time(),"The Time at your place is " + LocalTime.now().toSecondOfDay());
        assertEquals(watch.Set_time("19:30"), "Uptaded time is 19:30");
    }
}