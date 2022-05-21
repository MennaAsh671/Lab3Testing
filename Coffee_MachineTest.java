package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Coffee_MachineTest {
    Coffee_Machine machine = new Coffee_Machine();
    @Test
    public void test1(){
        assertEquals(machine.Coffee_dispenser(), "Coffee dispensed successfully");
    }
    @Test
    public void test2(){
        assertEquals(machine.collect_coins(10),"Coffee dispensed successfully");
    }
    @Test
    public void test3(){
        assertEquals(machine.collect_coins(8),"Sorry the entered cash is not sufficient");
    }
    @Test
    public void test4(){
        assertEquals(machine.Coffee_dispenser(), "Coffee dispensed successfully");
        assertEquals(machine.collect_coins(20),"Coffee dispensed successfully");
        assertEquals(machine.collect_coins(9)," Sorry the entered cash is not sufficient");
    }
}

