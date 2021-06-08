package practice1;

public class practice2 {
	
	public static void main(String[] args) {
		message();
		String use[][]=new String[2][2];
		use[0][0]="try";
		use[0][1]="power";
		use[1][0]="Good";
		use[1][1]="Use";
		for(int row=use.length-1;row>=0;row--)
		for(int col=use[row].length-1;col>=0;col--)	
			System.out.println(use[row][col]);
	}
	public static void message() {
		System.out.println("Test");
		System.out.println("-----");
	}

}
