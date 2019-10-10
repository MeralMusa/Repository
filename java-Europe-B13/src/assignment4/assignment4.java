package assignment4;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Question-1
		Write a Java program to print the following pattern
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		*/
		for (int i = 1; i <= 7; i++){
		    String str="";
		    for (int j = 1; j <= i; j++){ 
		        str=str+j+" ";
		    } 
		    System.out.println(str);
		}
		//Printing lower half of the pattern 
		for (int i = 6; i >= 1; i--){
		    String str="";
		    for (int j = 1; j <= i; j++){
		        str=str+j+" ";
		    }
		    System.out.println(str);
		}
		/*
		Question-2
		Write a Java program to print the following pattern
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6







		1 2 3 4 5 6 7
		*/
		//Printing upper half of the pattern
		for (int i = 7; i >= 1; i--){
		    String str="";
		    for (int j = 1; j <= i; j++){
		        str=str+j+" ";
		    }
		    System.out.println(str);
		}
		//Printing lower half of the pattern
		for (int i = 2; i <= 7; i++) {
		    String str="";
		    for (int j = 1; j <= i; j++){
		        str=str+j+" ";
		    }
		    System.out.println(str);
		}
		/*
		Question-3
		Write a Java program to print the following pattern
		1 2 3 4 5 6 7
		 2 3 4 5 6 7
		  3 4 5 6 7
		   4 5 6 7
		    5 6 7
		     6 7
		      7
		     6 7
		    5 6 7
		   4 5 6 7
		  3 4 5 6 7
		 2 3 4 5 6 7
		1 2 3 4 5 6 7
		*/
		//Printing upper half of the pattern
		for (int i = 1; i <= 7; i++){
		    String str="";
		    //Printing i spaces at the beginning of each row
		    for (int j = 1; j < i; j++){
		        str=str+" ";
		    }
		    //Printing i to rows value at the end of each row
		    for (int j = i; j <= 7; j++){ 
		        str=str+j+" "; 
		    } 
		    System.out.println(str);
		} 
		//Printing lower half of the pattern 
		for (int i = 6; i >= 1; i--){
		    String str="";
		    //Printing i spaces at the beginning of each row







		    for (int j = 1; j < i; j++){
		        str=str+" ";
		    }
		    //Printing i to rows value at the end of each row
		    for (int j = i; j <= 7; j++){
		        str=str+j+" ";
		    }
		    System.out.println(str);
		}
		/*
		Question-4
		Write a Java program to print the following pattern
		1
		10
		101
		1010
		10101
		101010
		1010101
		*/
		for(int i=1;i<9;i++){
		    String str="";
		    for(int j=1;j<i;j++){
		        if(j%2==1){
		        str=str+1+" ";
		        }else{
		          str=str+0+" ";  
		        }
		    }
		    System.out.println(str);
		}
		/*
		Question-5
		Write a Java program to print the following pattern
		1111111
		1111122
		1111333
		1114444
		1155555
		1666666
		7777777
		*/
		int row=7;
		for (int i = 1; i <= 7; i++){
		    String str="";
		    for (int j = 1; j <= row-i; j++){
		        str=str+"1";
		    }
		    for (int j = 1; j <= i; j++){
		        str=str+i;
		    }
		    System.out.println(str);
		}







		/*
		Question-6
		Write a Java program to print the following pattern
		1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15
		*/
		int row2=5;
		for (int i = 1; i <= row2; i++){
		    String str="";
		    int num = i;
		    for(int j = 1; j <= i; j++){
		        str=str+num+" ";
		        num = num+row2-j;
		    }
		    System.out.println(str);
		}

	}

}
