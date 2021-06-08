package OOPS;

abstract class ex1{
	abstract void add();
	void m1() {
		System.out.println("Abstract Method");
	}
}
public class abstractex extends ex1 {
	public void add() {
		
		System.out.println("Printing");
		System.out.println("    |   ");
		System.out.println("    v   ");
	}
	

	public static void main(String[] args) {
		abstractex r= new abstractex();
		r.add();
		r.m1();
	
	}

}
