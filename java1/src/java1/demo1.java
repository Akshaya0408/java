package java1;


	public  class demo1 {
		void show () {
			System.out.println("good morning");
		}
		void show (int a, int b) {
			System.out.println(a+b);
		}
		void show (double d1, double d2) {
			System.out.println(d1-d2);
		}
		void show (String s1, String s2) {
			System.out.println(s1+s2);
		}	
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			demo1 dl= new demo1();
			dl.show();
			dl.show(34, 25);
			dl.show(56.76, 45.6446);
			dl.show("he", "llo");

		}

	}
	
