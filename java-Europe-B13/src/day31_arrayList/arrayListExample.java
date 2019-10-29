package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("German");
		languages.add("English");
		languages.add("Dutch");
		languages.add("French");
		languages.add("Italian");
		
		System.out.println("Languages count: " + languages.size());
		System.out.println(languages.toString());

	}

}
