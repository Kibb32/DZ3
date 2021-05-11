package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a ;
        int b ;

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();

        System.out.println(" a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a = " + a + " b = "+b);

    }
}