package OOPS;

public class Interfacex {
	interface i{
		abstract void m1();
		
	}
	public class interfacex implements i{
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("Interface");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			interfacex y= new interfacex();
			y.m1();
			
		}
		

		
	}


}
