package com.intellimed.datastructures.linear;

public class IntNode {

	public int data;
	public IntNode next;
	
	
	public IntNode(int data, IntNode next) {
		this.data = data;
		this.next = next;
	}


	@Override
	public String toString() {
		return "IntNode [data=" + data + ", next=" + next + "]";
	}



	
	
}
