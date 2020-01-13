  
package day45_collections;

import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<Integer> list = new LinkedList<>();
		
		list.add(50);
		list.add(500);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.contains(50));
		
		list.add(30);
		list.add(40);
		list.add(60);
		list.add(60);
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.addFirst(1);
		list.addLast(99);
		
		System.out.println(list);
		
		
		

	
	}

}
