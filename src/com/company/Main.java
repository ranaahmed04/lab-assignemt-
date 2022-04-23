package com.company;

import java.util.Scanner;

public class Main {

            public static void main (String args[])
            {
                System.out.println(" enter the weight of watermelon ");
                Scanner input = new Scanner(System.in);
                int no_to_compare = input.nextInt();

                watermelon w = new watermelon();
                w.weight_checker(no_to_compare);


            }
}


