package com.stefanini.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArralList {

	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Aniket","Padma","Sagar","Suraj","Kavita");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}
