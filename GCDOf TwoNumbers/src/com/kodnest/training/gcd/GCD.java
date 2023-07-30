package com.kodnest.training.gcd;

public class GCD {
	

	public static int findGCD(int m, int n) {
		// TODO Auto-generated method stub
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		int gcd=m;
		return gcd;
	}

}
