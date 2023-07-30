package com.kodnest.training.pattern;

public class Pattern33 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                char c = (char) (ch+ i);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
