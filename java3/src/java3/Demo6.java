package java3;

interface I01 {
	void add();
}
interface I02{
	void sub();
}

interface I03 extends I01,I02 {
	void mul();
}
class sam2{
	void div() {
		System.out.println("byee");
	}
}
public class Demo6 extends sam2 implements I03{
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
		Demo6 d1=new Demo6();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}
}
