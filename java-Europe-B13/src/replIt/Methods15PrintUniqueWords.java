package replIt;
import java.util.Scanner;

public class Methods15PrintUniqueWords {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i=0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);
	  }
	  
	  public static void printUniqueWords(String[] words){
		  String dummy="";
		  for (int i=0;i<words.length;i++){
	          int count=0;

		           dummy=words[i];
		           for (int j=0;j<words.length;j++){

		             if (dummy.equalsIgnoreCase(words[j])&&i!=j){
		               count++;
		               
		               }
		             
		               
		               }
		           if (count==0){
		                 System.out.println(dummy);
		                 }
		           count=0;
		  }
		  
		  
		  }
		}