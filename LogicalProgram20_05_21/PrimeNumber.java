package com.ojas.ak;

import java.util.Scanner;

public class PrimeNumber {
	    int count=0;
	boolean isPrime(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count ++;
			}
		}
		if(count==2) {
			return true;
		}else
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		PrimeNumber pn = new PrimeNumber();
		System.out.println(pn.isPrime(num));
		
		
	}
}