package Method;

import Array.twodimensional;

public class Example1 {
	
	static Example1 e= new Example1(); 
	public static void main(String[] args) {
		test();
		System.out.println();
		methoderturntype d= new methoderturntype();
		twodimensional t=d.c1();
		t.message();
	}
	public static void test() {
		int a[]=new int [6];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		a[5]= 60;
		for ( int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public void test1() {
		String s[][]=new String[2][2];
		s[0][0]="Enter the User ID and Password";
		s[1][0]="Password : ";
		s[0][1]= "User ID : ";
		s[1][1]= "Click On Login";
		for ( int i=0;i<s.length;i++) {
			for ( int j=0;j<s[i].length;j++) {
				System.out.println(s[i][j]);
			}
		}
	}
	

}


