package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class code7 {
public static void main(String[] args) {
	Map<Integer, String> m=new HashMap<Integer,String>();
	m.put(1, "sachin");
	m.put(20, "sehwag");
	m.put(3, "Ganguly");
	m.put(40, "Laxman");
	m.put(5, "Dravid");
	m.put(60, "Kumble");
	m.put(1, "Zaheer");
	
	System.out.println(m);
	System.out.println("=============");
	System.out.println(m.containsKey(1));
	System.out.println(m.containsKey(9));
	System.out.println("================");
	System.out.println(m.containsValue("sachin"));
	System.out.println(m.containsValue("dhoni"));
	System.out.println("===============");
	for(int i=0;i<m.size();i++) {
		System.out.println(m.get(i));
	}
	System.out.println("===============");
	System.out.println(m.getClass());
	System.out.println("=================");
	System.out.println(m.getOrDefault(78,"No Data Available"));
	System.out.println(m.getOrDefault(20,"No Data Available"));
	System.out.println("===============");
	System.out.println(m.hashCode());
	System.out.println("===============");
	System.out.println(m.isEmpty());
	//m.clear();
	//System.out.println(m.isEmpty);
	System.out.println("===============");
	Set<Integer> set = m.keySet();
	Iterator<Integer> iterator = set.iterator();
while(iterator.hasNext()==true) {
	System.out.println(iterator.next());
}
System.out.println("===============");
Collection<String> collection = m.values();
m.putIfAbsent(20, "Shewag");
System.out.println(m);
m.putIfAbsent(90, "sachin");
m.putIfAbsent(20, "Virat");
m.putIfAbsent(20, "Rohith");
System.out.println(m);
System.out.println("===============");
String remove = m.remove(18);
System.out.println(remove);
System.out.println(m);
boolean remove2 = m.remove(20,"Shewag");
System.out.println(remove2);
System.out.println(m);
remove2 = m.remove(5, "sachin");
System.out.println(remove2);
System.out.println(m);
System.out.println("===============");
m.replace(5,"Jadeja");
System.out.println(m);
}
}


