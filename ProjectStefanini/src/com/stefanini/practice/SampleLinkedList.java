package com.stefanini.practice;

import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Amr");
		list.add("Gopal");
		list.add("Rahul");

		for (String s:  list ) {
			System.out.println(s);
		}
		
	}

}
