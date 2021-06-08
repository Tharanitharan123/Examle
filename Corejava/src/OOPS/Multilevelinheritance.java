package OOPS;

class c1{
	void v1() {
		System.out.println("Super Class");
	}
}
class c2 extends c1{
	void v2() {
		System.out.println("c1 act as super class for c2");
	}
}
public class multilevelinheritance extends c2 {
	void v3() {
		System.out.println("c2 act as super class for multilevelinheritance");
	}

	public static void main(String[] args) {
		multilevelinheritance a=new multilevelinheritance();
		a.v1();
		a.v2();
		a.v3();
	}

}

	
	

}
