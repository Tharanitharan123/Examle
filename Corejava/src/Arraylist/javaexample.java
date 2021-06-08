package Arraylist;

import java.util.ArrayList;

public class javaexample {
	
	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		i.add(50);
		System.out.println(i);
		System.out.println();
		System.out.println("After Adding an Element");
		System.out.println("------------------------");
		i.add(2, 25);
		System.out.println(i);
		System.out.println();
		System.out.println("After Replacing an Element");
		System.out.println("---------------------------");
		i.set(5,45);
		System.out.println(i);
		System.out.println();
		System.out.println("After Removing an Element Using Index Position");
		System.out.println("----------------------------------------------");
		i.remove(2);
		System.out.println(i);
		System.out.println();
		System.out.println("After Removing an Element Using an object");
		System.out.println("-----------------------------------------");
		i.remove(i.size()- 1);
		System.out.println(i);
		System.out.println();
		System.out.println("Iterating ArrayList using FOR EACH Condition");
		System.out.println("--------------------------------------------");
		for (Integer integer : i) {
			System.out.println(integer);
			
		}
		}
}
