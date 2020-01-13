package day46_collections_part2;


import java.util.*;

public class LoopSet {

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
	
	
	System.out.println(nums.size());
	System.out.println(nums);
	
	
	for(int n : nums) {
		System.out.print(n + " | ");
	}
	
	System.out.println();
	
	nums.forEach(n -> System.out.print(n + " | "));
	
	
	
	
	

	}

}