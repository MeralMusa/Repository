package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class findMaxLenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]length=new int[5];
		
		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();

			 length[i]=words[i].length();
			}
			
          Arrays.sort(length);
          for (int j=0;j<words.length;j++) {
         
        if (length[4]==words[j].length()) {
        	  
        	  System.out.println(words[j]);
        	  
          }
	      
          }
		}

	
		
	

}
