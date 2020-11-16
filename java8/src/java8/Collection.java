package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {
	
	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList();
		
		al= Arrays.asList(10,5,11,12,13,15,20);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		for(Integer list:al) {
		
			System.out.println(list);
			
			if(list.equals(10)) {
				
				System.out.println("10 is present");
				
			}
		}
		
//		if(al.contains(10)) {
//			
//			System.out.println("10 is present");
//		}
//		
//		else {
//			System.out.println("10 is not present");
//		}
//		
		
		
		
		
		
		
		
	}

}
