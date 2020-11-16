package java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(1,"meeta");
		m.put(2,"geeta");
		m.put(3,"suneeta");
		m.put(4,"omm");
		m.put(5,"priti");	
		
		//System.out.println(m);
		
		/* forEach  */
//		m.forEach((k,v)->{
//			
//			System.out.println("key"+ k +"value" + v);
//		});
//	
		
		
	/* stream api*/	
		
//	m.entrySet().stream().forEach(e-> {
//		System.out.println("key"+ e.getKey() +"value"+ e.getValue());
//		
//	});
		
		
		
	/* enhanced for loop */
		
//		for (Map.Entry<Integer,String> km :m.entrySet()) {
//			
//			System.out.println("key"+ km.getKey() +"value"+ km.getValue());
//			
//		}
		
		/* iteration over keys */
		
		
//		Set<Integer> keySet = m.keySet();
//		
//		for(Integer mk:keySet) {
//			System.out.println("key" +mk +"value" +m.get(mk));
//			
//		}
//		
		/* iterator using while loop */
		
		
	
//		Iterator<Map.Entry<Integer, String>> iterator = m.entrySet().iterator();
//		
//		while(iterator.hasNext()) {
//			
//			Map.Entry<Integer, String> mp= iterator.next();
//			
//			System.out.println(mp.getKey()+mp.getValue());
//		}
//		
//		
		
		
	
	}
	

}


