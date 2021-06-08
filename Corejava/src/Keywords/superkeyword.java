package Keywords;

class id {
		int id=20;
	}
	public class superkeyword extends id{
		void display() {
		System.out.print(super.id);
		}

		public static void main(String[] args) {
			superkeyword i= new superkeyword();
			i.display();
		}

	}


	
