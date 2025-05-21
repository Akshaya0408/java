package java3;

interface I6 {
	void add();
}
interface I7{
	void sub();
}

interface I8 extends I6,I7 {
	void mul();
}
class sample2{
	void div() {
		System.out.println("byee");
	}
}
public class demo5 extends sample2 implements I8{
	public class Demo2 {

	}

	public void add() {
		System.out .println("b");
	}
	public void sub() {
		System.out.println("y");
	}
	public void mul(){
		System.out.println("e");
	}

	public static void main(String[] args) {
		demo5 d1=new demo5();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}
}