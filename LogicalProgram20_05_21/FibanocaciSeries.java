package com.ojas.ak;

import java.util.Scanner;

public class FibanocaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value");
		int num = sc.nextInt();
		
		int a=0,b=1,temp=0;
		System.out.println(a);
		System.out.println(b);
		while(temp<num) {
			temp= a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
		
		
	}
}
