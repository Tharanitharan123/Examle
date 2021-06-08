package OOPS;
	
	class mod1{
		void sample() {
			System.out.println("Print Polymorphism");
		}
	}
	public class polymorphismMOR extends mod1 {
		void sample() {
			System.out.println("Method Over riding");
		}

		public static void main(String[] args) {
			mod1 u=new mod1();
			u.sample();
			System.out.println();
			polymorphismMOR y=new polymorphismMOR();
			y.sample();

		}

	}


}
