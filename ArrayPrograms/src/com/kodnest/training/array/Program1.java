package com.kodnest.training.array;
import java.util.Scanner;
public class Program1 {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int N =scan.nextInt();
	int []a=new int[N];
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	
  }
}
