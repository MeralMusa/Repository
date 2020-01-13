package day45_collections;


import java.util.*;
import java.util.Collection;
import java.util.Iterator;

public class ArrayVSArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//Arrays are fixed size
			//Allows duplicates
			//Keeps ordering
			//Allows primitives and objects
			
			int[] numsArray = {30,50,501,30,5,5};
			String[] days = new String[7];
			days[0]="Monday";
			days[1]="Tuesday";
			
			ArrayList<Integer> numList = new ArrayList<>();
			
			List<Integer> numList2 = new ArrayList<>();
			
			numList.add(44);
			numList.add(44);
			numList.add(101);
			
			System.out.println(numList.toString());
			
			
			
			
		}



	
	}

