package replIt;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDezimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    int remainder=0;
	    for (int i = 0; i < binary.length; i++) {
			binary[i]=0;
	    }	
	    	
    	remainder=(decimal/128)%128;	
	    	if(remainder%2==1){  //128 //128
	    		binary[0]=1;
			  }
			remainder=(decimal/64)%64;
  			if(remainder%2==1) { //192 //64
	  			binary[1]=1;
		  	}
			remainder=(decimal/32)%32;
  			if(remainder%2==1) { //224 //32
	  			binary[2]=1;
		  	}
			remainder=(decimal/16)%16;
  			if(remainder%2==1) { //240 //16
	  			binary[3]=1;
		  	}
			remainder=(decimal/8)%8;
  			if(remainder%2==1) { //248  //8
	  			binary[4]=1;
		  	}
			remainder=(decimal/4)%4;
  			if(remainder%2==1) { //252 //4
	  			binary[5]=1;
		  	}
			remainder=(decimal/2)%2;
  			if(remainder%2==1) {//254  /2
	  			binary[6]=1;
		  	}
	  	remainder=(decimal%2);
  			if(remainder%2!=0) { //255  /1
	  			binary[7]=1;
		  	}
	    System.out.println(Arrays.toString(binary));
  }
}
