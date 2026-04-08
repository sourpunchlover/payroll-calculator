package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name:");
        String your_name = sc.nextLine();

        System.out.print("Hours worked:");
        float hours_worked = sc.nextFloat();
        System.out.print("Pay rate:");
        float pay_rate = sc.nextFloat();
        sc.nextLine();

        float total = hours_worked*pay_rate;

        System.out.printf("%f * %f = %f", hours_worked, pay_rate, total );







    }
}
