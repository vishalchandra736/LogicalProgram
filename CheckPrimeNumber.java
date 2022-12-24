package com.blz.logicalprogram;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num;
        int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        num = scan.nextInt();
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println(num + " is not Prime Number");
        else
            System.out.println(num + " is Prime Number");
    }
}
