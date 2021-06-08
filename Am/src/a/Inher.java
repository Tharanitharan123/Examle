package a;
	class sub1{
		void m1(){
			System.out.println("im base class");
		} 
	}
	public class Inher extends sub1 {
	void m2(){
		System.out.println("im derived  class");
	}
	public static void main(String[] args) {
		Inher i=new Inher();
		i.m2();
		i.m1();
		sub1 s=new sub1();
	
	}

}
