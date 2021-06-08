package Inher;

class sub1{
	void m1(){
		System.out.println("im base class");
	} 
}

class sub2 extends sub1{
	void m2(){
		System.out.println("im derived class");
	} 
}

public class Polymorphism extends sub1{
	void m3(){
		System.out.println("im derived class");

	}
	public static void main(String[] args) {
		Polymorphism h=new Polymorphism();
		h.m1();
		h.m3();
		sub2 s2=new sub2();
		s2.m1();
		s2.m2();
		sub1 s1=new sub1();
		s1.m1();
	
	}

}
