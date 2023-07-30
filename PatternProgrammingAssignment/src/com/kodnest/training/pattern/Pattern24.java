package com.kodnest.training.pattern;

public class Pattern24{
public static void main(String[] args) {
    int n = 5; 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print(n-(i-1));
        }
        System.out.println();
    }
}
}