package java3;

	interface parent1 {
		void strict();
	}
	interface parent2{
		void chill();
		
	}
	class child1{
		void naughty() {
			System.out.println("child1 is naughty");
		}
	}
	class child2 extends child1 implements parent1,parent2{
		public void decent() {
			System.out.println("child2 is decent");
		}
		public void strict() {
			System.out.println("parent1 is strict");
		}
		public void chill() {
			System.out.println("parent2 is chill");
		}
	}
	class child3 extends child2{
		public void neutral() {
			System.out.println("child3 is neutral");
		}
	}

	public class demo9{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			child1 c1=new child1();
			child2 c2=new child2();
			child3 c3=new child3();
			c2.decent();
			c2.naughty();
			c2.strict();
			c2.chill();
			c1.naughty();
			c3.neutral();
			c3.decent();

		}

	
}
