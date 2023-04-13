package com.example.list;

import java.util.ArrayList;
import java.util.List;

import java.util.*;
public class ForEachItorator {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Core-Java");
		list.add("Adv Java");
		list.add("Spring");
		list.add("Hibernate");
		list.add("REST");
		
		System.out.println("The Size of list : "+list.size());
		try {
			
			for(String i:list) {
				list.remove(i);
				System.out.println(i);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}

	}

}
