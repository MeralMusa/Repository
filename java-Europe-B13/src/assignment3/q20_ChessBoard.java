package assignment3;

public class q20_ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 8; i++) { //outer loop to print 8 rows
		    String print="";
		    for(int j = 1; j <= 8; j++) { //inner loop to print 8 columns in each row
		        if ((i + j) % 2 != 0) {
		            print=print+"B" + " "; //Print B when sum of i + j is odd
		        } else {
		            print=print+"W" + " "; //Print W when sum of i + j is even
		        }
		    } //inner for ends
		    System.out.println(print); //New line at the end of each row
		} //outer for ends
		}


	}


