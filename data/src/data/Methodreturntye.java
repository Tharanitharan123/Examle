 package data;

public class Methodreturntye {

	 static int c;
	 static double d; 
	 public static void main(String[] args) {
	  Mul(2,3);
	  Div(7,3);
	  System.out.println("Value of c Is "+c);
	  System.out.println("Value of d Is "+d);
	  Message();
	 }				
	 public static int Mul(int a, int b){
	  c=a*b;
	  return c;  
	 } 
	 public static double Div(double a, double b){
	  d=a/b;
	  return d;  
	 }
	 public static void Message(){
	  System.out.println("Test Message");
		
	}

}
