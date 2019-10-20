package day27_array_part4;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[] b = {7,3};
		
		System.out.println(commonEnd(a, b));

	
	
	}
	
	public static String commonEnd(int[] x, int[] y) {
		
		if(!(x.length>1)) {
			return "Array 1 is not valid";
		}
		if(!(y.length>1)) {
			return "Array 2 is not valid";
		}
		
		
		if(x[0]==y[0] || x[x.length-1]==y[y.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}}