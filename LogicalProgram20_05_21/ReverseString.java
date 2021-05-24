package com.ojas.ak;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		String orginal =sc.nextLine();
		String reverse="";
		
		for(int i=orginal.length()-1;i>=0;i--) {
			reverse = reverse+orginal.charAt(i);
		}
		System.out.println(reverse);
		
	}
}
