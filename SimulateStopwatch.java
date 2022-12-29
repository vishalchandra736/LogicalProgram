package com.blz.logicalprogram;

import java.util.Scanner;
public class SimulateStopwatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to start the stop watch : ");
        int startTime = scan.nextInt();
        startTime = (int) System.currentTimeMillis();
        System.out.println("Press 0 to stop the stop watch : ");
        int endTime = scan.nextInt();
        endTime = (int) System.currentTimeMillis();
        System.out.println("The Elapsed time is  " + ((endTime - startTime) / 1000) + " seconds");
    }
}
