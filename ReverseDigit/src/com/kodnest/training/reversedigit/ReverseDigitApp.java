package com.kodnest.training.reversedigit;
import java.util.Scanner;
public class ReverseDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int o=n;
		ReverseDigit res=new ReverseDigit();
		int s=res.reverseDigit(n);
		if(o==s) {
			System.out.println("Palindrome"); 
		}
		else {
			System.out.println("Not Palindrome");
		}

	}


	
}
