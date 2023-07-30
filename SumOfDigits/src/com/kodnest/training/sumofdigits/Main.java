package com.kodnest.training.sumofdigits;
import java.util.Scanner;
public class Main{
   public static void calculateSumOfDigits(int n) {
	  int sum=0;
	  while(n!=0) {
		  int digit=n%10;
	      sum=sum+digit;
	      n=n/10;
	  }
      System.out.println(sum);
   }
   public static void main(String[] args)
   {
	   Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       calculateSumOfDigits(n);
  }
}

