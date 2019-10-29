package replIt;
import java.util.Arrays;
import java.util.Scanner;

public class ParseHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hypertext Markup Language (HTML) is the standard markup language 
//		for creating web pages and web applications. HTML is the language in which most 
//		websites are written. HTML is used to create pages and make them functional.
//String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
//
//		
//		String[] infoArray1 = info1.split("password :");
//		
//		System.out.println(Arrays.toString(infoArray1));
//		
//		
//		String pass1 = infoArray1[1].split(". Please")[0];
//		
//		System.out.println(Arrays.toString(infoArray1[1].split(". Please")));
//		
//		
//		
//		pass1 = pass1.substring(4, 10);
//		
//		
//		System.out.println(pass1.trim() );
////
//
//
//		Write a program, that will read html variable and output attribute value of 
//		id attribute (tag) into the console. Input will be provided in a single line as outlined
//		below. If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!". 

		   Scanner scan = new Scanner(System.in);
		    String html = scan.nextLine();
		    
		    if (html.contains("=")){

		    String[] dum =html.split("id=\"");
		    
		  String dum1=dum[1].split("\">")[0];

		//   dum1=dum1.replace("\"","");
		   System.out.println(dum1);

	}else {
		
		System.out.println("Invalid input!");
	}
			   
 
		   
	}
	

}
