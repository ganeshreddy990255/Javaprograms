package arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class code1 {
	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
	System.out.println("======================");
	
	ListIterator<Integer> litr = al.listIterator(al.size());
	while(litr.hasPrevious()==true) {
		System.out.println(litr.previous());
	}
}

}