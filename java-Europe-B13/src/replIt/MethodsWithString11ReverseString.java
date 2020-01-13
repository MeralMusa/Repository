package replIt;

public class MethodsWithString11ReverseString {

	public static void main(String[] args) {
		
		String input ="jsnc?,,adk";
		
		char[] inputArr = input.toCharArray();  
		 char[] tempArr = new char[input.length()];  
		 int i=0;  
		 int j=0;  
		 for (char ch:inputArr){  
		   if(Character.isAlphabetic(ch)){  
		     tempArr[i] = ch;  
		     i++;  
		   }  
		 }  
		 i--;  
		 while(j<i){  
		   char temp = tempArr[i];  
		   tempArr[i]= tempArr[j];  
		   tempArr[j]=temp;  
		   j++;  
		   i--;  
		 }  
		 
		 for(i=0,j=0;i<input.length();i++){  
		   if(Character.isAlphabetic(inputArr[i])){  
		     inputArr[i]= tempArr[j++];  
		   }  
		 }  
	      String word = String.valueOf(inputArr);

		 System.out.println(word);
		 }
	}