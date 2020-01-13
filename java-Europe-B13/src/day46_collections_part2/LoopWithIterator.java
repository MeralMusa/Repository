package day46_collections_part2;


import java.util.*;

public class LoopWithIterator {

	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		nums.add(50);
		nums.add(540);
		nums.add(1150);
		nums.add(720);
		nums.add(90);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		
		System.out.println(nums);
		
		//1- Create Iterator object
		Iterator<Integer> it  = nums.iterator();
		
		//2 - hasNext, next methods
		// hasNext return true, if there is still next value, return false when it reaches the end or empty
		// next() method return the current value and moves to next value
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		
		System.out.println();
		
		//System.out.println(it.next());
		
		//What is the difference between for each and iterator loop?
		//we can remove objects while looping - iterator
		
		/*
		
		Iterator<Integer> it2  = nums.iterator();
		while(it2.hasNext()) {
			int val = it2.next();
			if(val>1000) {
				it2.remove();
			}
		}
		
		System.out.print(nums + " |");
		*/
		
		
		for(Integer num : nums) {
			
			if(num>1000) {
				
				nums.remove(new Integer(num));
			}
		}
		
		System.out.println(nums);
		
		
		

	}

}