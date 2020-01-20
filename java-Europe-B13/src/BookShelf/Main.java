package BookShelf;

import BookShelf1.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Book n1=new Book	();
	         
	         
	       n1.setTitle("kjnkj");

		
		
	      System.out.println(n1.getTitle());
	      
	    System.out.println( n1.capitalize("The TITANik OF The BelieveVr"));
	    
	    System.out.println(n1.isTitleWord(""));
	    
	n1.setAuthor("mArufJon TemAiroSv");



	System.out.println(n1.getAuthor());

	System.out.println(n1.toString());
	System.out.println(n1.getUnknownAuthors());
	n1.setTitle("BaCOn");

	System.out.println(n1.getTitle());
	
	
	n1.setTitle("WOODEN SOon");
	System.out.println(n1.getTitle());
	}
	}