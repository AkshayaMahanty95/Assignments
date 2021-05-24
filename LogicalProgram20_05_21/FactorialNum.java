package com.ojas.ak;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
	for(int i =1;i<=num;i++) {
		fact = fact*i;
	}
	System.out.println("Factorial of given Number"+fact);
	
		
//		int num=5;
//        int fact =1;
//        for(int i=1;i<=num; i++) {
//        	fact = fact*i;
//        }
//        System.out.println("5 factorial is" +fact);
//		
	}

}
