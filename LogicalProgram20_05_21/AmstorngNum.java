package com.ojas.ak;

import java.util.Scanner;

public class AmstorngNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rem,sum=0;
		int temp=num;
		
		while(num>0) {
			rem = num%10;
			num = num/10;

			sum=sum+(rem*rem*rem);
		}
		if(sum==temp) {
			System.out.println("Given Number is Amstrong");
		}else {
			System.out.println("Not Amstorng");
		}
		
		
	}

}
