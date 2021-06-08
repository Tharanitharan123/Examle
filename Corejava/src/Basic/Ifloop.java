package Basic;

public class Ifloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20,j=20,k=30;
		if(i<j)
		{
			System.out.println("I is less than j ");
			if(i<j && i<k)
			{
				System.out.println("I is the very smallest number compared to others");
			}
			if(i<j || i>k)
				System.out.println("The value if I is -> " + i);
		}	
		else if (i>j) 
		{
			System.out.println("I is greater than j ");
			if(j<i && j<k)
			{
				System.out.println("J is the Second Smallest Number");
			}
			if(j<i || j>k)
				System.out.println("The value of J is -> "+ j);
		}
		else
			System.out.println("I is equal to J");
			System.out.println("The value of I and J is -> " + i);
	}

}


	
