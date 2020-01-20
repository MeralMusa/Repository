package BookShelf1;

import java.util.Arrays;

public class Dumclass {
	
	public static void main(String[]args) {
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
	n1.setTitle("The BLdhKS KJSnxkn");
		
	System.out.println(n1.getTitle());

	n1.setAuthor("");
	System.out.println(n1.getAuthor());
	}
	
	
	   //instance variables for Book object
 private String author;
 private String title;
 private int id;
 private int pages;
 //static variable to track number of books with unknown author
 private static int unknownAuthors;

 /**
     Utility static method: capitalize
     accepts a String and then returns in capitalized form(first uppercase - rest lowecase)
     if argument is empty, it returns an empty String ""
     capitalize("jAVa") => "Java"
     capitalize("HTML") => "Html"
     capitalize("") => ""
     This method will be used in setAuthor(), setTitle() methods
  */
 public static String capitalize(String word) {
		String [] arr= {};
		String nword="";
		arr =word.split(" ");
		for (int i =0;i<arr.length;i++) {
			
	    	 arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length()).toLowerCase();

	    	 nword+=arr[i]+" ";
		}

		
 	nword=nword.substring(0, nword.length()-1);
 	return nword;
 }

 /**
   Utility static method: isTitleWord
   -This method will be used in setTitle() method
   -Accepts a words to check if it is a part of the title or just an article etc.
   - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
   -else method returns true
   Articles:
  "a" , "an", "the"
   Coordinate conjunctions:
  "and", "but", "for", "nor", "or", "so", "yet"
  Most common single-word English prepositions:
  "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"

  isTitleWord("Apple") => true
  isTitleWord("a") => false
  isTitleWord("BUT") => false
  isTitleWord("THE") => false
  isTitleWord("neaR") => false
  isTitleWord("java") => true

  */
 public static Boolean isTitleWord(String word) {
		boolean isTitel=true;
 	String[] fpa= {"a" , "an", "the","and", "but", "for", "nor", "or", "so", "yet","at", "by", "in", "into", "near", "of", "on", "to", "than", "via"};
 	
 	for(int i=0;i<fpa.length;i++) {
 		
 		if(fpa[0].equalsIgnoreCase(word)||fpa[1].equalsIgnoreCase(word)||fpa[2].equalsIgnoreCase(word)||fpa[3].equalsIgnoreCase(word)||fpa[4].equalsIgnoreCase(word)||
 				fpa[5].equalsIgnoreCase(word)||fpa[6].equalsIgnoreCase(word)||fpa[7].equalsIgnoreCase(word)||fpa[8].equalsIgnoreCase(word)||fpa[9].equalsIgnoreCase(word)||
 				fpa[10].equalsIgnoreCase(word)||fpa[11].equalsIgnoreCase(word)||fpa[12].equalsIgnoreCase(word)||fpa[13].equalsIgnoreCase(word)||fpa[14].equalsIgnoreCase(word)||fpa[15].equalsIgnoreCase(word)||
 				fpa[16].equalsIgnoreCase(word)||fpa[17].equalsIgnoreCase(word)||fpa[18].equalsIgnoreCase(word)||fpa[19].equalsIgnoreCase(word)) {
 			
 			isTitel=false;
 		} else {
 			isTitel=true;
 		}
 	}
 	return isTitel;
 }
 	
 	
 

 /**
  * No args constructor. Stays empty
  */
 public Dumclass() {
 }

 /**
  * 4 args constructor. accepts id, author, title, pages
  * CALLS SETTER methods to assign to instance variables.
  * ex: setId(id);
  * It does NOT directly assign to the instance variable
  * ex: NO => this.id = id;
  */
 public Dumclass(int id, String author, String title, int pages ) {
    
 	setId(id);
 	setAuthor(author);
 	setTitle(title);
 	setPages(pages);
 	
 }

 /**
  * setAuthor method will be used to set value to private author of the Book
  * @param author : String
  * Conditions:
  *    => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
  *                                             2) static unknownAuthors is incremented by one.
  *    => Each word in Book author's name should be capitalized. CALL capitalize method
  *  Example:
  *  Book b = new Book();
  *  b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
  *  b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
  *  b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
  */
 public void setAuthor(String author) {
     
     if(author.isEmpty()) {
     	this.author="Unknown";
     	getUnknownAuthors();
     }else {
     	
     	this.author=capitalize(author);
     	
     	
     }
     
 }

 /**
  * setTitle method will be used to set value to private title of the Book
  * @param title : string
  * Conditions:
  *   => if title is single word, capitalize it and assign to this.title.
  *   => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
  *   => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
  *              See full list in isTitleWord method, they need to be all lowercase.
  *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
  *              -> Call capitalize method to capitalize title words.
  *   => First word is always capitalized regardless if it is article etc.
  *   Ex:
  *      Book book = new Book();
  *      book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
  *
  *      book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
  *
  *
  */
 public void setTitle(String title) {
 	 
 	if (title.contains(" ")==false){
      	
     	
    	this.title= capitalize(title);
        

 	}else if(title.isEmpty()) {
     	 
     	 this.title="";
      
      }else {
 	 	String tit="";
             String []arr= {};

    
             	arr=title.split(" ");
             	

             	for(int i =0;i<arr.length;i++){
         	
             		if(isTitleWord(arr[i])) {
             			
             		
             			capitalize(arr[i]);
             	
        }else {
     	   arr[i].toLowerCase();
     	   
        }
             		


             }
  
         
     	for(int a =0; a<arr.length;a++) {
     		
     		tit+=arr[a]+" ";
     	   
         	
     	}
  	   tit=tit.substring(0,tit.length()-1);

     	
     this.title= tit;
     	 
     	 
     	 
     	 
      }
     	
     	
     
     

 }

 @Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", id=" + id + ", pages=" + pages + "]";
	}


 /**
  * Getter methods for static unknownAuthors
  * @returns unknownAuthors value
  */
 public static int getUnknownAuthors(){
    
    unknownAuthors=0;
    unknownAuthors= unknownAuthors++;
    return unknownAuthors;

 }

 /**
  * Getter methods for private pages
  * @returns pages value
  */
 public int getPages() {
    
    
    return pages;
 }

 /**
  * Setter method for private pages. No conditions
  * @param pages
  */
 public void setPages(int pages) {
   
   this.pages=pages;
   
 }

 /**
  * public Getter method for private author
  */
 public String getAuthor() {
   
   return author;
 }


 /**
  * public Getter method for private title
  */
 public String getTitle() {
    
    
    return title;
 }


 /**
  * public Getter method for private id
  */
 public int getId() {
   
   
   return id;
 }
 /**
  * public setter method for private id
  */
 public void setId(int id) {
    
    
    this.id=id;
 }


}
