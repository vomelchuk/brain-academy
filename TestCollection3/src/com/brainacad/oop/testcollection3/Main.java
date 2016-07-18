package com.brainacad.oop.testcollection3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		// filling lists
		final String prefix = "number_";
		for (int i = 0; i <= 10; i++) {
			arrayList.add(prefix + i);
			linkedList.add(prefix + i);
		}
		// printing lists using ordinary iterator
		System.out.println("Array list:");
		printElements(arrayList);
		System.out.println("Liked list:");
		printElements(linkedList);
		// insert linkedList into arrayList using ListIterator
		ListIterator<String> linkedIter = linkedList.listIterator();
		int index = arrayList.size() - 1;
		while (linkedIter.hasNext()) {
			arrayList.add(index--, linkedIter.next());
		}
		System.out.println("Array list after insertion using ListIterator...:");
		printElements(arrayList);

	}

	// print list using Iterator
	private static <T> void printElements(List<T> list) {
		Iterator<T> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
