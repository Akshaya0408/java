package java1;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		List<Object>l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("bye");
		l1.add(67);
		l1.add(2,"namaste");
		System.out.println(l1);
		List<Object>extra= Arrays.asList("vikhi","arjun","sai");
		l1.addAll(extra);
		System.out.println(l1);
		
		}

}
