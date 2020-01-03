package replIt;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsWithArrayList8CombineAll {

	public static void main(String[] args) {
		  ArrayList<String>wordList1 = new ArrayList<String>(3);
		  
		  wordList1.add("halo");
		  wordList1.add("ball");
		  wordList1.add("auto");

		  ArrayList<String>wordList2 = new ArrayList<String>(5);
		  
		  wordList1.add("kaka");
		  wordList1.add("toll");
		  wordList1.add("elefant");
		  wordList1.add("tier ");
		  wordList1.add("leber");

		System.out.println(combineAl(wordList1,wordList2));
	}

	
	public static ArrayList <String> combineAl(ArrayList<String> wordList1,ArrayList<String>wordList2){
		
		int size=wordList1.size()+wordList2.size();
       
		
		

  ArrayList<String>wordListAl = new ArrayList<String>(size);


	Collections.sort(wordList1);
	Collections.sort(wordList2);

  wordListAl.addAll(wordList1);
  wordListAl.addAll(wordList2);
       
		
		
		return  wordListAl;

	}


}
