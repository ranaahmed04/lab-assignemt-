package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class watermelonTest {

    @Test
    public void test_even1() throws IllegalArgumentException{
        watermelon test1 = new watermelon();
        assertEquals(true,test1.weight_checker(8));
    }
    @Test
    public void test_even2() throws IllegalArgumentException{
        watermelon test2 = new watermelon();
        assertEquals(true,test2.weight_checker(60));
    }
    @Test
    public void test_odd1() throws IllegalArgumentException{
        watermelon test3 = new watermelon();
        assertEquals(false,test3.weight_checker(7));
    }
    @Test
    public void test_odd2() throws IllegalArgumentException{
        watermelon test4 = new watermelon();
        assertEquals(false,test4.weight_checker(55));
    }
    @Test
    public void test_negative() throws IllegalArgumentException{
        watermelon test5 = new watermelon();
        assertThrows(IllegalArgumentException.class,() ->{
                test5.weight_checker(-10);
    });
    }
    @Test
    public void test_large() throws IllegalArgumentException {
        watermelon test6 = new watermelon();
        assertThrows(IllegalArgumentException.class, () -> {
            test6.weight_checker(6000);
        });
    }

    @Test
    void weight_checker() {
    }
}