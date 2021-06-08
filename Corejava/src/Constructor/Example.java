package Constructor;
import accessmodifier.c1;
public class Example {
	public static void main(String[] args) {
		Example a=new Example();

		String s[][]=new String[2][2];
		s[0][0]="Enter the User ID and Password";
		s[1][0]="Password : ";
		s[0][1]= "User ID : ";
		s[1][1]= "Click On Login";
		for ( int i=0;i<s.length;i++) {
			for ( int j=0;j<s[i].length;j++) {
				System.out.println(s[i][j]);
			}
		}
	}
	public Example ( ) {
		System.out.println("Constructor");
		c1.Testing_public();
	

}
}
