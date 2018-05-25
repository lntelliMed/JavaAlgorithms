package com.intellimed.datastructures.tree;

import java.util.Scanner;

public class MainHeapApp {

	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integers to be added to the heap. "
				+ "Enter 'exit' to stop!");
		String line = scanner.next();
		while(!line.equalsIgnoreCase("exit")){
			heap.insert(Integer.parseInt(line));
			System.out.println(heap);
			System.out.println("Enter integers to be added to the heap. "
					+ "Enter 'exit' to stop!");
			line = scanner.next();
		}
		
		while(!heap.isEmpty()){
			int max = heap.delete();
			System.out.println(max + " -- " + heap);
		}
	}

}
