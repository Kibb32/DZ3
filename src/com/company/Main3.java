package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите зарплаты сотрудников");

        System.out.print("Первый сотрудник: ");
        double zp1 = input.nextDouble();
        System.out.print("Второй сотрудник: ");
        double zp2 = input.nextDouble();
        System.out.print("Тредтий сотрудник: ");
        double zp3 = input.nextDouble();

        double max = 0;
        double min = 0;

        if (zp1 >= zp2 && zp1 >= zp3) {
            max = zp1;
        }
        if (zp2 >= zp1 && zp2 >= zp3) {
            max = zp2;
        }
        if (zp3 >= zp1 && zp3 >= zp1)  {
            max = zp3;
        }
        if (zp1 <= zp3 && zp1 <= zp2) {
            min = zp1;
        }
        if (zp2 <= zp1 && zp2 <= zp3) {
            min = zp2;
        }
        if (zp3 <= zp2 && zp3 <= zp1) {
            min = zp3;
        }

        double result = max - min;
        System.out.println("Разница на "+result);


    }
}
