package data;

public class twodimentional {

	public static void main(String[] args) {
		String a[][]=new String[2][2];
		a[0][0]="new";
		a[0][1]="old";
		a[1][0]="gold";
		a[1][1]="dia";
		for(int i=0;i<a.length;i++) 
		for(int j=0;j<a[i].length;j++) 
		System.out.println(a[i][j]);
		}
	
	}

