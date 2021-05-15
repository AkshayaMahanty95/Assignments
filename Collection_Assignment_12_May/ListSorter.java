//Write a java program to sort a list of integers

package com.ojas.collection12_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {
	public static List<Integer> sortIntList(List<Integer> inputList) {
		List<Integer> list = new ArrayList<>();
		list.add(452);
		list.add(54);
		list.add(12);
		list.add(455);
		list.add(24);
		list.add(784);
		Collections.sort(list);
		list.forEach(System.out::println);
		return list;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		System.out.println(sortIntList(list));
	}

}
