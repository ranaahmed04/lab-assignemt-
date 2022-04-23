package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YoungPhysicistTest {
    int [][]array={{4,1,7},{-2,4,-1},{1,-5,-3}};//false
    int [][]array1={{-1,-2,3},{-2,3,-1},{3,-1,-2}};//true
    int [][]array2={{-5,6,8},{5,-6,-8}};//true
    int [][]array3={{-20,10,30},{20,40,35},{-20,-50,-65}};//false
    int [][]array4={{-100,-100,-300},{60,30,100},{10,10,50},{30,60,150}};//true
    int [][]array5={{-100,100,50},{100,-50,-25},{0,-50,-25}};
    int [][]array6={{3,-1,7},{-5,2,-4},{2,-1,-3}};//true



    @Test
    public void test1()throws IllegalArgumentException{
        YoungPhysicist YOUNG=new YoungPhysicist();
        assertEquals(false, YOUNG.Calc_Coordinates(3, array));
        assertEquals(true, YOUNG.Calc_Coordinates(3, array6));

    }
    @Test
    public void test2()throws IllegalArgumentException {
        YoungPhysicist YOUNG=new YoungPhysicist();
        assertEquals(false, YOUNG.Calc_Coordinates(2, array5));
    }
    @Test
    public void test3()throws IllegalArgumentException {
        YoungPhysicist YOUNG=new YoungPhysicist();
        assertEquals(true, YOUNG.Calc_Coordinates(3, array1));
    }
    @Test
    public void test4()throws IllegalArgumentException {
        YoungPhysicist YOUNG=new YoungPhysicist();
        assertEquals(true, YOUNG.Calc_Coordinates(2, array2));
    }
    @Test
    public void test5()throws IllegalArgumentException {
        YoungPhysicist YOUNG=new YoungPhysicist();
        assertEquals(false, YOUNG.Calc_Coordinates(3, array3));
    }
    @Test
    public void test6()throws IllegalArgumentException {
        YoungPhysicist YOUNG=new YoungPhysicist();
        assertEquals(false, YOUNG.Calc_Coordinates(4, array4));
    }
}

