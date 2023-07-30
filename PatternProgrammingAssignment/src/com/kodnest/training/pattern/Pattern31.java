package com.kodnest.training.pattern;

public class Pattern31 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                char c = (char) (ch + i + j);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
