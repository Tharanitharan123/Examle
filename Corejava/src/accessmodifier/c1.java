package accessmodifier;

public class c1 {
	
	public static int i=10;
	public static String s1="Hello";
	private static int k=20;
	private static double d=10.20;
	protected static int l=30;
	protected static char a='V';
	public static void main(String[] args) {
		Testing_public();
		Testing_private();
		Testing_protected();
	}
	public static void Testing_public() {
		System.out.println("Testing Public");
		System.out.println("--------------");
		System.out.println("The value of I = "+ i);
		System.out.println("The given string is : "+s1);
		System.out.println();
	}
	private static void Testing_private() {
		System.out.println("Testing Private");
		System.out.println("---------------");
		System.out.println("The value of k = "+ k);
		System.out.println("The value of d = "+d);
		System.out.println();
	}
	protected static void Testing_protected() {
		System.out.println("Testing Protected");
		System.out.println("-----------------");
		System.out.println("The value of l = "+ l);
		System.out.println("The given character is : "+a);
		System.out.println();
}
}