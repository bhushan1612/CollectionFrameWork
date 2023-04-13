package com.example.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueListPratice {

	public static void main(String[] args) {
		Queue<String> qList= new PriorityQueue<String>();
		qList.add("Ferari");		
		qList.add("Mustang");
		qList.add("Mustbushi");
		qList.add("Camero");
		qList.add("Wrangler");
		qList.add("Compass");
		
		System.out.println("Size of List : "+qList.size());
		
		/*for (String s : qList) {
			
			System.out.println(s);
			
		}*/
		
		Iterator<String> qiterIterator =  qList.iterator();
		while(qiterIterator.hasNext()) {
			String str = qiterIterator.next();
			System.out.println(str);
		}
		
		
	}

}
