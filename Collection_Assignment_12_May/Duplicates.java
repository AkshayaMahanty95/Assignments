
//Write a java program to find duplicates in an arrayList.


package com.ojas.collection12_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
	public static void getDuplicatesList() {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,4,6,2,8,1,9,2,7,3));
		System.out.println("Numbers :" + Arrays.asList(1,3,5,4,6,2,8,1,9,2,7,3));
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (Integer p : arr) {

			if (!set1.add(p)) {
				set2.add(p);
			}
		}

		System.out.println("Duplicate are " + set2);
	}

	public static void main(String[] args) {
		getDuplicatesList();

	}

}
