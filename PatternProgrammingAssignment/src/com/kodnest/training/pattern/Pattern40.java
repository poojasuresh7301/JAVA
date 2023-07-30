package com.kodnest.training.pattern;

public class Pattern40 {
    public static void main(String[] args) {
       int n=4;
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
