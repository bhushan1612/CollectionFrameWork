package com.example.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> maleList = new ArrayList<String>();
		maleList.add("Bhushan");
		maleList.add("Tushar");
		maleList.add("Hitesh");
		maleList.add("Piyush");
		maleList.add("Prashant");
		maleList.add("Mayur");
		maleList.add("Kiran");

		System.out.println("\n");
		System.out.println("*********Male List Value*********");

		System.out.println("Size of Male list :" + maleList.size());

		Iterator<String> it = maleList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		List<String> femaleList = new ArrayList<String>();
		femaleList.add("Mansi");
		femaleList.add("Rutuja");
		femaleList.add("kalyani");

		System.out.println("\n");
		System.out.println("************Female List Value************");
		System.out.println("Size of Female list : " + femaleList.size());

		Iterator<String> itr = femaleList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<String> classList = new ArrayList<String>();
		classList.add("Raja");
		classList.addAll(maleList);
		classList.addAll(femaleList);
		classList.add("Priyanka");

		System.out.println("\n");
		System.out.println("*********Class List Value*********");
		System.out.println("Size of Class List : " + classList.size());

		Iterator<String> iter = classList.iterator();
		while (iter.hasNext()) {
			iter.remove();
			System.out.println(iter.next());

		}
	}

}
