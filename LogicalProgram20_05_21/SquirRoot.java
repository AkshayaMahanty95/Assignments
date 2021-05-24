package com.ojas.ak;

import java.util.Scanner;

public class SquirRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number =sc.nextInt();
		
		for(int i=1;i<number/2;i++) {
			if(i*i==number) {
				System.out.println("Given Number is Perfect Squire of  "+i);
				
			}
		}
	}
}
