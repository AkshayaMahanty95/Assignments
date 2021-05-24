package com.ojas.ak;

import java.util.Scanner;

public class BiggestNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		int bigg = array[0];
		for(int i=1;i<array.length;i++) {
			
			if(array[i]>bigg) {
				bigg = array[i];
			}
			
		}
		System.out.println("Bigg number is x" +bigg);
		}

}
