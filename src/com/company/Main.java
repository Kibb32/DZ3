package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Введите 6-ти значный номер биллета: ");
        number = input.nextInt();

        int digit1 = number / 100000;
        int digit2 = (number / 10000) % 10;
        int digit3 = (number % 10000) / 1000;
        int digit4 = (number % 1000) / 100;
        int digit5 = (number % 100) / 10;
        int digit6 = (number % 100) % 10;

        double sum1 = digit1+digit2+digit3;
        double sum2 = digit4+digit5+digit6;

        if (sum1 == sum2){
            System.out.println("Счастливый");
        }
        else {
            System.out.println("Несчастливый");
        }



	// write your code here
    }
}
