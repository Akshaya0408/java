
package java3;
interface Chocolate{
	void cfalvour();
}
class Butterscotch{
	void bfalvour(){
		System.out.println("Butterscotch Falvour");
	}
}
class vanilla extends Butterscotch implements Chocolate{
	public void cfalvour() {
		System.out.println("chocolate Falvour");
	}
	void vfalvour() {
		System.out.println("vanilla Falvour");
	}
}
class Strawberry{
	void sfalvour() {
		System.out.println("Strawberry Falvour");
	}
}
class Pista extends Strawberry{
	void pfalvour() {
		System.out.println("Pista Falvour");
	}
}

public class PRO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vanilla v= new vanilla();
		Pista p=new Pista();
		v.cfalvour();
		v.bfalvour();
		v.vfalvour();
		p.sfalvour();
		p.pfalvour();

	}

}
