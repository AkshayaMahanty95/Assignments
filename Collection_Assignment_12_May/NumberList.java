/*
In the given Class NumberList.java, implement method getNumberList() such that for the following input : 
“1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-26” the output displayed is:
1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30. 

*/


package com.ojas.collection12_05;

import java.util.Arrays;
import java.util.Scanner;

public class NumberList {
	public static String getNumberList(String list) {
		String str = "";
		if (list == null) {
			return null;

		}
		String[] arr = (list.replaceAll("-", ",").split(","));
		int[] nums = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(nums);
		for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
			str += i + ",";
		}
		return str.substring(0, str.length() - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number list: ");
		String lst = sc.next();
		System.out.println(getNumberList(lst));

	}

}