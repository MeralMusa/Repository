package day46_collections_part2;
import java.util.*;

public class LoopArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(540);
		nums.add(1150);
		nums.add(720);
		nums.add(90);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		
		//Loop using for each loop
		
		for(int n : nums) {
			System.out.print(n + " | ");
		}
		
		System.out.println();
		
		//loop using for-iterator
		
		for(int i = 0;i<nums.size();i++) {
			System.out.print(nums.get(i) + " | ");
		}
		
		System.out.println();
		
		//loop using forEach method
		//Lambda expression
		
		nums.forEach(n -> System.out.print(n + " | "));
		
		System.out.println();
		
		
		//functional programming 
		nums.removeIf(n -> n<500);
		nums.forEach(n -> System.out.print(n + " | "));
		
		
		
		
		
		

	}

}