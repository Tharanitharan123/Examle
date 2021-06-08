package Array;

public class twodimention {

	public static void main(String[] args) {
		String str[][]=new String[2][3];
		str[0][0]="Access";
		str[0][1]="Hcl";
		str[0][2]="Wipro";
		str[1][0]="Tidle";
		str[1][1]="Park";
		str[1][2]="technologies";
		for(int row=str.length-1; row>=0; row--)
		for(int col=str[row].length-1; col>=0;col--)
		System.out.println(str[row][col]);
		 
	}

}
