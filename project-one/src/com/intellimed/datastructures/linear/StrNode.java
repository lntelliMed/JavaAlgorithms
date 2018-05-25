package com.intellimed.datastructures.linear;

public class StrNode {

	public String data;
	public StrNode next;
	
	
	public StrNode(String data, StrNode next) {
		this.data = data;
		this.next = next;
	}


	@Override
	public String toString() {
		return "StrNode [data=" + data + ", next=" + next + "]";
	}



	
	
}
