package replIt;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodswithArrayList9removeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  ArrayList<String>wordList = new ArrayList<String>(3);
			  
			  wordList.add("halo");
			  wordList.add("ball");
			  wordList.add("auto");
			  
			String   targetWord="halo";
			
			
			removeAll(wordList,targetWord);
		System.out.println(wordList);
			
	}
	public static void removeAll(ArrayList <String> wordList,String targetWord){


		wordList.removeAll(Arrays.asList(targetWord));
		

}}