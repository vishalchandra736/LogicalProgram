package com.blz.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, lastDigit;
        int reverseNum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = scan.nextInt();
        System.out.println("Original Number : " + num);
        while (num > 0) {
            lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Reverse Number : " + reverseNum);
    }
}
