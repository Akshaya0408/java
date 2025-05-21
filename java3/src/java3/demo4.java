package java3;
interface I3{
	void add();
}
interface I4{
	void sub();
}
interface I5 extends I3,I4{
	void mul();
}
class Sample22{
	void div() {
		System.out.println("Div");
	}
}

public class demo4 extends Sample22 implements I5{
	public void add() {
		System.out.println("Add");
	}
	public void sub() {
		System.out.println("Sub");
	}
	public void mul() {
		System.out.println("mul");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   demo4 d=new demo4();
   d.add();
   d.sub();
   d.mul();
   d.div();
	}

}