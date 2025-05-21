package java3;
interface College{
	void nrcm();
}
interface Department extends College{
	void cse();
}
class Aiml implements Department{
	public void nrcm() {
		System.out.println("NRCM1");
	}
	public void cse() {
		System.out.println("CSE1");
	}
	public void batch1() {
		System.out.println("batch1");
	}
}
class Ds implements College,Department{
	public void nrcm() {
		System.out.println("NRCM2");
	}
	public void cse() {
		System.out.println("CSE2");
	}
	public void batch2() {
		System.out.println("batch2");
	}
}

public class PRO9 extends Aiml {
	public static void main(String[] args) {
	Aiml a=new Aiml();
	Ds d =new Ds();
	a.nrcm();
	a.cse();
	a.batch1();
	d.nrcm();
	d.cse();
	d.batch2();
	
	}
}
