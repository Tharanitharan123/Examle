package Method;

import Array.twodimensional;

public class Methodreturntype {

		static int c;
		static int d;

		public static void main(String[] args) {
		message();
		System.out.println();
		add(5,3);
		sub(8,10);
		System.out.println("1.The Value of C is : "+c);
		System.out.println();
		System.out.println("2.The Value of D is : "+d);

		}
		public static void message () {
			System.out.println("Code Testing");
			System.out.println("------------");
		}
		public static int add(int a, int b) {
			c=a+b;
			return c;
		}
		public static int sub(int a, int b) {
			d=a-b;
			return d;
		}
		public twodimensional c1() {
			return new twodimensional();
		}

	}


