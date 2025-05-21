package java1;

	
	interface I1{
		void add();
	}
	interface I2{
		void sub();
	}

	public class demo2 implements I1{
		public void add() {
			System.out.println("hi");
		}
		public void sub() {
			System.out.println("hello");
		}
		


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			demo2 d1= new demo2();
			d1.add();
			d1.sub();
		}
	}

