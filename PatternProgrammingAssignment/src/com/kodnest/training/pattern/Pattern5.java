package com.kodnest.training.pattern;
public class Pattern5 {
  public static void main(String[] args) {
    int n = 5;
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j <= i; j++)
     {
       if( j == 0 || j == i || i == n-1)
       {
         System.out.print(j+1 + " ");
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