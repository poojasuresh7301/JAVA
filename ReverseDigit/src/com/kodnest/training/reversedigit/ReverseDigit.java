package com.kodnest.training.reversedigit;

public class ReverseDigit {
	public int reverseDigit(int n) {
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
	}
}
