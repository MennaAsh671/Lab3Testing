package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class atmTest {
    atm atm = new atm(300);
    @Test
    public void test1(){
        assertEquals(atm.add_deposit(100),"Transaction done");
    }
    @Test
    public void test2(){
        assertEquals(atm.withdraw_cash(450),"Transaction cannot done");
    }
    @Test
    public void test3(){
        assertEquals(atm.withdraw_cash(300),"Transaction done");
    }
    @Test
    public void test4(){
        assertEquals(atm.Receipt_Check(),"The Balance of your bank account is: " + atm.balance);
    }
    @Test
    public void test5(){
        assertEquals(atm.add_deposit(100),"Transaction done");
        assertEquals(atm.withdraw_cash(50),"Transaction done");
    }
    @Test
    public void test6(){
        assertEquals(atm.add_deposit(200),"Transaction done");
        assertEquals(atm.withdraw_cash(350),"Transaction cannot be done");
        assertEquals(atm.Receipt_Check(),"The Balance of your bank account is: " + atm.balance);
    }
}