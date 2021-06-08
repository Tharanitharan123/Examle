package Basic;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10,j=20;
		char c='a';
		String a= " HI! WELCOME TO TRIOTEND SOLUTION ";
		System.out.println("Add.Result="+ (i+j) + " " + "Sub.Res=" + (i-j));
		System.out.println("Mul.Result="+ (i*j)+" "+("Div.Result=" +(j/i)));
		System.out.println("Character : " + c);
		System.out.println("String - " + "[" + a + "]");
		test();
		
	}
// User Defined main method
public static void test () {
	int i=10,j=5;
	System.out.println("Boolean : "+(i>j?"True":"False"));
	double k=12.24;
	System.out.print("Result = "+(k+i+j));
	
	}

}
