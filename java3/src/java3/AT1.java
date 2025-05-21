package java3;
interface Mrng{
	void clg();
}
interface Night{
	void sleep();
}
interface Afternoon extends Mrng,Night{
	void eat();
}
class Watching{
	void Phone() {
		System.out.println("Watching reels");
	}
}

public class AT1 extends Watching implements Afternoon{
	public void clg() {
		System.out.println(" just Go and Come");
	}
	public void sleep() {
		System.out.println("sleep...zzzzzzzzz");
	}
	public void eat() {
		System.out.println("eat.........");
	}
	void overthinking() {
		System.out.println("overthink......");
	}
	public static void main(String[] args) {
		AT1 r = new AT1();
		r.clg();
		r.eat();
		r.sleep();
		r.overthinking();
	}

}

