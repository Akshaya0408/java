package java3;

interface ssc{
	void jammikunta();
}
class inter{
	public void  beemaram() {
		System.out.println("akshaya"
				+ "");
			}
}
class btech extends inter implements ssc{
	public void hyderabad() {
		System.out.println("nrcm");
	}
	public void jammikunta() {
		System.out.println("kakatiya");
	}
}
class branch extends btech{
	public void section() {
		System.out.println("ece");
	}
	
}

public class demo7{

	public static void main(String[] args) {
		btech b1=new btech();
		branch b2=new branch();
		b1.jammikunta();
		b2.section();
		b1.hyderabad();
		b1.beemaram();

	}

}
