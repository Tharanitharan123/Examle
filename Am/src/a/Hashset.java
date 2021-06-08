package a;

import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		a.add("Six");
		a.add("Seven");
		a.add("Eight");
		a.add("Nine");
		a.add("Ten");
		a.add("Eleven");
		System.out.println(a);
		for (String f : a) {
			System.out.println(f);
		
		}
		LinkedHashSet<Integer> a1 = new LinkedHashSet<Integer>();
		a1.add(10);
		a1.add(25);
		a1.add(40);
		a1.add(80);	
		a1.add(2);
		System.out.println(a1);
		for (Integer d : a1) {
			System.out.println(d);
			
		}
		}
	}

