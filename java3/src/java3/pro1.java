package java3;

interface I0{
	void top();
}
interface I9{
	void bottom();
}
interface I10{
	void dupatta();
}
interface I11 extends I0,I9,I10{
	void dress();
}

public class pro1 implements I11 {
	public void top() {
		System.out.println("top colour is white");
	}
	public void bottom() {
		System.out.println("bottom colour is black");
	}
	public void dupatta() {
		System.out.println("dupatta is multi coloured");
	}
	public void outfit() {
		System.out.println("complete outfit");
	}

	public static void main(String[] args) {
		pro1 d1=new pro1();
		d1.top();
		d1.bottom();
		d1.dupatta();
		d1.outfit();
		

	}
	@Override
	public void dress() {
		System.out.println("person is dressed prfectly");
		
	}

}