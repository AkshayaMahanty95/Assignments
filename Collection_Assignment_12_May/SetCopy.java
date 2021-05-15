
//Write a java program to copy a set to another

package com.ojas.collection12_05;

import java.util.HashSet;

public class SetCopy {
	public static void main(String[] args) {
		HashSet<String> mainsource = new HashSet<String>();
		HashSet<String> copydestination = new HashSet<String>();
		mainsource.add("Akshaya");
		mainsource.add("Dinesh");
		System.out.println("Main :" + mainsource);
		copydestination = (HashSet) mainsource.clone();
		System.out.println("Copy :" + copydestination);
	}

}
