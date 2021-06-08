package a;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> arlist=new ArrayList<String>();
		arlist.add("Red");
		arlist.add("Green");
		arlist.add("Blue");
		arlist.add("Yellow");
		for (String val:arlist) {
			System.out.println(val);
			}
	}

}
