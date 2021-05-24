package com.ojas.ak;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		String orginal =sc.nextLine();
		String reverse="";
		
		for(int i=orginal.length()-1;i>=0;i--) {
			reverse = reverse+orginal.charAt(i);
		}

		if(orginal.equals(reverse)) {
			System.out.println("Given name is Palindrom");
		}else {
			System.out.println("Given name is NOT Palindrom");
		}
	}

}
