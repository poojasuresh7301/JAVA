package com.kodnest.training.pattern;

public class Pattern14 {
   public static void main(String[] args) {
     int n = 5;
     for(int i = 0; i < n; i++)
    {
      for(int j = 0; j <= i; j++)
      {
         System.out.print(i+1 + " ");
       }
       System.out.println();
    }
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n-i; j++)
      {
        System.out.print(n-i + " ");
      }
       System.out.println();
    }
  }
}