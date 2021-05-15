
//Write a java program to convert a list to an array

package com.ojas.collection12_05;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void convertToArray() {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(125);
		inputList.add(545);
		inputList.add(348);

		Integer[] array = (Integer[]) inputList.toArray(new Integer[inputList.size()]);

		System.out.println("[" + array[0] + "," + array[1] + "," + array[2] + "]");

	}

	public static void main(String[] args) {
		convertToArray();
	}

}
