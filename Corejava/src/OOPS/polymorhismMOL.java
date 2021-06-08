package OOPS;

public class polymorhismMOL {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorhismMOL e=new polymorhismMOL();
		e.add(10,15);
		e.add(20);
	
	}

}
