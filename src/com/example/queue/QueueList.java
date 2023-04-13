package com.example.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*****************Queue Integer**********************");
		Queue<Integer> qlist = new PriorityQueue<Integer>();
		qlist.add(1);
		qlist.add(2);
		qlist.add(3);
		qlist.add(6);
		qlist.add(4);
		qlist.add(5);
		System.out.println("Size of Queue : " + qlist.size());

		Iterator<Integer> qitr = qlist.iterator();
		while (qitr.hasNext()) {
			int i = qitr.next();
			System.out.println(i);
		}
		System.out.println("Element of Queue : " + qlist.element());
		System.out.println("Queue : " + qlist);
		System.out.println("Element of Peek : " + qlist.peek());
		System.out.println("Queue : " + qlist);
		// System.out.println("Element of Poll : "+qlist.poll());
		System.out.println("Queue : " + qlist);
		System.out.println("Element of remove : " + qlist.remove(3));
		System.out.println("Queue : " + qlist);

		System.out.println("Element of offer : " + qlist.offer(2));

		System.out.println("*****************List String Iterator**********************");
		List<String> maleList = new ArrayList<String>();
		maleList.add("Bhushan");
		maleList.add("Tushar");
		maleList.add("Hitesh");
		maleList.add("Piyush");
		maleList.add("Prashant");
		maleList.add("Mayur");
		maleList.add("Kiran");
		maleList.add("SuyogSir");

		System.out.println("Size of List : " + maleList.size());
		Queue<String> qlistString = new PriorityQueue<String>(maleList);

		Iterator<String> qitr1 = maleList.iterator();
		while (qitr1.hasNext()) {
			String s = qitr1.next();
			System.out.println(s);
		}
		System.out.println("*****************Queue String ForEach**********************");
		for (String e : qlistString) {
			System.out.println(e);
		}
	}

}
