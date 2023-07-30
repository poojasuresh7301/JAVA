package com.kodnest.training.array;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a[]=new int[N];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		for (int i : a) {
			System.out.print(i+5);
		}

	}

}
