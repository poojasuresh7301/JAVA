package com.kodnest.training.fibonnaci;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		fibonnaciCalculate(n);

	}
	public static void fibonnaciCalculate(int n) {
		int fibonnaci=0;
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.println(fib1);
		}
		else if(n==2) {
			System.out.println(fib1 +" "+fib2);
		}
		else {
			System.out.print(fib1 +" "+fib2+" ");
			for(int i=3;i<=n;i++) {
				fibonnaci=(fib1+fib2);
			    fib1=fib2;
			    fib2=fibonnaci;
			    
			    System.out.print(fibonnaci+" ");
		
		}
		
		}
	}

}
