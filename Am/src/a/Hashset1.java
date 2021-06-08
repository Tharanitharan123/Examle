package a;

import java.util.LinkedHashSet;

public class Hashset1 {

	public static void main(String[] args) {
		LinkedHashSet<String> file =new LinkedHashSet<String>();
		file.add("First Program");
		file.add("Second Program");
		file.add("Third Program");
		file.add("fourth program");
		System.out.println(file);
		for (String d:file) {
			System.out.println(d);
		}
		LinkedHashSet<Integer> file1 =new LinkedHashSet<Integer>();
		file.add("5");
		file.add("10");
		file.add("25");
		file.add("30");
		file.add("35");
		for (Integer g:file1) {
			System.out.println(g);
		}
	}

}
