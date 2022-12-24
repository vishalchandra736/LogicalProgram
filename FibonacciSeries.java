package com.blz.logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num, temp;
        int firstNumber = 0;
        int secondNumber = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = scan.nextInt();
        System.out.println("Fibonacci Series - ");
        if (num == 1)
            System.out.println(firstNumber);
        else if (num == 2)
            System.out.println(firstNumber + " " + secondNumber);
        else {
            System.out.print(firstNumber + " " + secondNumber);
            for (int i=0; i<num-2; i++) {
                System.out.print(" " + (firstNumber + secondNumber));
                temp = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }
        }
    }
}
