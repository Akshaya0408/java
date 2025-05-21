package java3;


	interface rainy{
		void rainyseason();
	}
	interface summer{
		void summerseason();
	}
	class winter{
		void winterseason() {
			System.out.println("3rd winter ");
		}
	}
	class year extends winter implements rainy, summer{
		public void completeyear() {
			System.out.println("rainy,summer,winter");
		}
		public void rainyseason() {
			System.out.println("1st rainy ");
		}
		public void summerseason() {
			System.out.println("2nd summer");
		}
	}

	public class demo8{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			winter W1=new winter();
			year y1=new year();
			y1.rainyseason();
			y1.summerseason();
			y1.completeyear();
			y1.winterseason();

		}

	}

	
