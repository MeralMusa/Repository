package day46_collections_part2;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Double> items = new HashMap<>();
		
		items.put("Apples", 3.49); //key + value
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Cherrries", 6.0);
		items.put("Milk", 5.0);
		items.put("Milk", 4.0);  //key needs to be unique
		
		System.out.println(items.size());
		
		System.out.println(items.get("Apples"));
		System.out.println(items.get("Milk"));
		
		System.out.println(items); //no orderd
		
		System.out.println(items.isEmpty());
		
		items.remove("Flowers");
		
		System.out.println(items);
		
		System.out.println("Is apple in the list?" + items.containsKey("Apples"));
		
		items.replace("Eggs", 2.99);
		System.out.println("Price of eggs:" + items.get("Eggs"));
		
		//increase cherries $2
		items.replace("Cherrries", items.get("Cherrries")+2);
		System.out.println("Price of cherries:" + items.get("Cherrries"));
		
		
		
		
		
		
		
		
		
		
		

	}

}