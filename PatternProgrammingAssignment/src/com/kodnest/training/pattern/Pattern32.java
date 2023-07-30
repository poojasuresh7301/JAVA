package com.kodnest.training.pattern;

public class Pattern32 {
    public static void main(String[] args) {
        char ch= 'E';
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                char c = (char) (ch - j);
                System.out.print(c);
            }

            System.out.println();
        }
    }
}
