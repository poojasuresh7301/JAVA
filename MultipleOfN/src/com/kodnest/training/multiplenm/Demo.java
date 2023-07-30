package com.kodnest.training.multiplenm;
import java.util.Scanner;
public class Demo {
	public static void checkMultiple(int m,int n) {
		if(m%n==0) {
			System.out.println("Multiple of ");
		}
		else {
			System.out.println(" Not Multiple");
		}

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		checkMultiple( m, n);
	}

}
