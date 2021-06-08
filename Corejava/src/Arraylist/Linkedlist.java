package Arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l= new LinkedList<String>();
		l.add("Testing 1");
		l.add("Testing 2");
		l.add("Testing 3");
		l.add("Testing 4");
		System.out.println("Original String");
		System.out.println("---------------");
		System.out.println(l);
		System.out.println();
		System.out.println("Using For Loop");
		System.out.println("--------------");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		System.out.println("Using For Each Loop (Advance FOR Loop)");
		System.out.println("--------------------------------------");
		for (String str : l) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Using Iterator");
		System.out.println("--------------");
		Iterator i= l.iterator();
		System.out.println("Printing Forward");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

