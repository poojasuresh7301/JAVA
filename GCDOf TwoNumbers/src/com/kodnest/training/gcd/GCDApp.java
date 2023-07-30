package com.kodnest.training.gcd;
import java.util.Scanner;
public class GCDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println(GCD.findGCD(m,n));

	}

}
