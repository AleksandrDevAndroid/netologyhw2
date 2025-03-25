package org.aleks.perov;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int socre = 0;
        while (true) {
            System.out.println("Введите год:");
            int year = sc.nextInt();

            System.out.println("Введите количество дней:");
            int days = sc.nextInt();

            if(leapYear(year) == days) {
                socre++;
            }
            else if (leapYear(year) != days) {
                System.out.printf("Неправильно! В этом году %s дней!",leapYear(year));
                System.out.printf("\nНабрано очков: %s",socre);
                break;
            }
        }

    }

    public static int leapYear(int inputYear) {
        if (inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}


