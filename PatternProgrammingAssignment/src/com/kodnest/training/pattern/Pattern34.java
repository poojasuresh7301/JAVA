package com.kodnest.training.pattern;

public class Pattern34 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n- i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
            	   
                char c = (char) (ch + i - k);
                System.out.print(c + " ");
            }
            System.out.println();
            ch++;
        }
      
    }
}
