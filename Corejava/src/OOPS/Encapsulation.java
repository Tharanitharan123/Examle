package OOPS;

public class Encapsulation {
	
	int id,DD,MM,YR;
	String name;
	char Initial;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public char getInitial() {
		return Initial;
	}

	public void setInitial(char initial) {
		Initial = initial;
	}
	public int getDD() {
		return DD;
	}

	public void setDD(int dD) {
		DD = dD;
	}

	public int getMM() {
		return MM;
	}

	public void setMM(int mM) {
		MM = mM;
	}

	public int getYR() {
		return YR;
	}

	public void setYR(int yR) {
		YR = yR;
	}

	public static void main(String[] args) {
		Encapsulation y=new Encapsulation();
		y.setId(515);
		System.out.print("ID : ");
		System.out.println(y.getId());
		y.setInitial('R');
		System.out.print("NAME : ");
		System.out.print(y.getInitial() +"." );
		y.setName("Keerthana");
		System.out.println(y.getName());
		System.out.print("D.O.B : ");
		y.setDD(14);
		System.out.print(y.getDD()+"/");
		y.setMM(03);
		System.out.print(y.getMM()+"/");
		y.setYR(1999);
		System.out.println(y.getYR());


}
}