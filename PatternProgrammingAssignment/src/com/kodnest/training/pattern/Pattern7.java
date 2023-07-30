package com.kodnest.training.pattern;
public class Pattern7 {
   public static void main(String[] args) {
     int n = 5;
        for(int i = 0; i < n; i++)
        {
         for(int j = 0; j < n-i; j++)
         {
          if(i == 0 || i == n-1 || j == 0 || j == n-i-1)
          {
            System.out.print(i+j+1 + " ");
          }
          else
          {
             System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}