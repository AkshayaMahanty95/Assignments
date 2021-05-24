package com.ojas.ak;

import java.util.Scanner;

public class SmallNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		int small = array[0];
		for(int i=1;i<array.length;i++) {
			
			if(array[i]<small) {
				small = array[i];
			}
			
		}
		System.out.println("small value is "+small);
		}

}
