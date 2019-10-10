package assignment3;

public class q17_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) { //outer loop for 7 rows
		    String print="";
		    for(int j = 1; j <= i; j++) { //inner loop
		        print=print+i;
		    }
		    System.out.println(print);
		}

	}

}
