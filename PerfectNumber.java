package com.blz.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
    public static int allFactorSum(int num) {
        int factorSum = 0;
        for(int i=1; i<=num/2; i++) {
            if (num%i == 0)
                factorSum += i;
        }
        return factorSum;
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = scan.nextInt();
        if (num == allFactorSum(num))
            System.out.println(num + " is a Perfect Number" );
        else
            System.out.println(num + " is not a Perfect Number");
    }
}
