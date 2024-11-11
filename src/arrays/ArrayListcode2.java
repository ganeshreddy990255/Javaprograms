package arrays;

import java.util.ArrayList;

public class ArrayListcode2 {
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		System.out.println(al);
		
al.addFirst(1000);
al.addLast(2000);
System.out.println(al);

al.clear();
//System.out.println(al);

ArrayList al1 = (ArrayList) al.clone();
System.out.println(al1);

System.out.println(al1.contains(100));
System.out.println(al1.contains(1050));

ArrayList al2 = new ArrayList();
al2.add(44);
al2.add(45);
al2.add(46);
al2.add(47);
System.out.println(al2);

al.addAll(al2);

System.out.println(al);

System.out.println(al.containsAll(al2));
System.out.println(al1.containsAll(al2));

System.out.println(al.contains(al1));

Object o = al.get(5);
System.out.println(o);
//o = al.get(50);-->out of bound exception
//System.out.println(o);

System.out.println(al.getClass());

System.out.println(al.getFirst());
System.out.println(al.getLast());

System.out.println(al.hashCode());

	}
}




