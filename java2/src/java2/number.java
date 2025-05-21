package java2;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package IFCL;
		interface One{
			void o1();
		}
		interface Two{
			void t2();
		}
		interface Three{
			void t3();
		}
		class Four implements One,Two,Three{
			public void o1() {
				System.out.println("111111111111");
			}
			public void t2() {
				System.out.println("222222222222");
			}
			public void t3() {
				System.out.println("333333333333");
			}
			
			void f4() {
					System.out.println("444444444444");
			}
			
		}
		interface Five{
			void f5();
		}

		class Number extends Four implements Five{
			public void f5() {
				System.out.println("555555555555");
			}
			void numbers() {
				System.out.println("1234567890..");
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       Number n= new Number();
		       n.o1();
		       n.t2();
		       n.t3();
		       n.f4();
		       n.f5();
		       n.numbers();
			}

		}

	}

}
