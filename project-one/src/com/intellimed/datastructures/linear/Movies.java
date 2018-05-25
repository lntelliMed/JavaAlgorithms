package com.intellimed.datastructures.linear;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {
		StrNode front = null;
		System.out.println(front);
		
		System.out.println("Enter a movie name:");
		Scanner scanner = new Scanner(System.in);
		String movie = scanner.nextLine();
		front = addToFront(front, movie);
		System.out.println("Added --> " + front);
		
		System.out.println("Enter another movie name:");
		movie = scanner.nextLine();
		front = addToFront(front, movie);
		System.out.println("Added --> " + front);
		
		try {
			front = deleteFront(front);
			System.out.println("After deletion --> " + front);
			
			front = deleteFront(front);
			System.out.println("After deletion --> " + front);
			
			front = deleteFront(front);
			System.out.println("After deletion --> " + front);
		} catch (NoSuchElementException e) {
			//e.printStackTrace();
			System.out.println("You tried to delete a null node!");
		}

	}
	
	public static StrNode addToFront(StrNode front, String movie){
		return new StrNode(movie, front);
	}
	
	public static StrNode deleteFront(StrNode front){
		if (front == null) {
			//return front;
			throw new NoSuchElementException();
		}
		return front.next;
	}

}
