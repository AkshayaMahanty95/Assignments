
//Write a Java program to convert Array to List

package com.ojas.collection12_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static <String> List<String> convertToList(String inputArray[]) {
		List<String> list = new ArrayList<>();// creating an empty list
		for (String s : inputArray) {
			list.add(s);
		}
		return list;

	}

	public static void main(String[] args) {

		String array[] = { "I", "am", "akshaya" };
		System.out.println(Arrays.toString(array));
		List<String> lst = convertToList(array);
		
	}

}
