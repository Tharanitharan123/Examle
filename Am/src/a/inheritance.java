package a;

public class inheritance {
	
	class sub1{
		void m1(){
			System.out.println("im base class");
		} 
	}
	public class Inheritance extends sub1 {
	void m2(){
		System.out.println("im derived  class");
	}
	public void main(String[] args) {
		Inheritance i=new Inheritance();
		i.m2();
		i.m1();
		sub1 s=new sub1();
		s.m1();
	}


	}

}
