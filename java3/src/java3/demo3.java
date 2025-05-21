package java3;

interface i1{
	void add();
}
interface i2{
	void sub();
}

public class demo3 implements I1{
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