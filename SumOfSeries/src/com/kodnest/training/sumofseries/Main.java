package com.kodnest.training.sumofseries;
import java.util.Scanner;
public class Main {

    public static void calculateSumOfSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("The sum of the series is: " + sum);
    }

    public static void main(String[] args) {
        // Example usage: calculate the sum of the series for n = 5
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        calculateSumOfSeries(n);
    }
}