package java3;

interface A1{
	void Serial1();
}
interface A2{
	void Serial2();
}
interface A3{
	void Serial3();
}
interface A4{
	void Serial4();
}
class season implements A1,A2,A3{
	public void Serial1() {
		System.out.println("serial1 has 1 season");
	}
	public void Serial2() {
		System.out.println("serial2 has 2 seasons");
	}
	public void Serial3() {
		System.out.println(" serial3 has 3 seasons");
	}
	public void Serial4() {
		System.out.println("serial4 has 4 seasons");
	}
	
}
public class PRO3 extends seasons implements S4 {
	public void maa() {
		System.out.println("serial1 and serial2 are from maa");
	}
	public void zee() {
		System.out.println("serial3 and serial4 are from zee ");
	}

	public static void main(String[] args) {
		PRO3 p=new PRO3();
		seasons s=new seasons();
		s.Serial1();
		s.Serial2();
		s.Serial3();
		s.Serial4();
		p.maa();
		p.zee();
		
		
		

	}

}