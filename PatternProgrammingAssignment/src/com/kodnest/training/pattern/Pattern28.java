package com.kodnest.training.pattern;

public class Pattern28 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print((i + 1) );
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
