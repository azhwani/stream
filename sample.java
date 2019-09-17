package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Diana");
		names.add("Mason");
		names.add("Jackson");
		names.add("Luke");
		names.add("Emma");
		names.add("Charlotte");
		names.add("Amelia");
		names.add("Sophia");
		names.add("Kevin");
		
		//
		Optional<String> name = names.stream().map(s -> s.toUpperCase())    // Intermediaire operation
						      .filter(s -> s.length() > 5)  // Intermediaire operation
						      .findAny();                   // Terminal operation
		
		//
		if(name.isPresent())
			System.out.println(name);
		else
			System.out.println("NONE");

	}
}
