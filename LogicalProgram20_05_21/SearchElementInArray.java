package com.ojas.ak;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter Searching Element");
		int num = sc.nextInt();
		
		int low=0;
		int high=size-1;
		int mid = 0;
		
		while(low<=high) {
			mid = (low+high)/2;
			if(array[mid]==num) {
				System.out.println("Value of index is "+mid);
				break;
			}else if(array[mid]>num) {
				high = mid-1;
			}else if(array[mid]<num) {
				low = mid+1;
			}
		}
		if(low>high) {
			System.out.println("value Not found");
		}
		
	}
}
