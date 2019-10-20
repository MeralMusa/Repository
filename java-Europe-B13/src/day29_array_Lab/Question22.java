package day29_array_Lab;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[]x= {1,4,1};
		int[]y= {1,4,4};

		
		
		System.out.println(onebig(x));
		System.out.println(onebig(y));
		
	}

	
	
	public static boolean onebig(int[] arr) {
	int count2 =0;

	int count =0;
	for(int i=0;i<arr.length;i++) {
		
		
	if (arr[i]==1)	{
		count=count+1;
	}
	if (arr[i]==4) {
		
		count2=count2+1;
		
	}
	}
	
	if (count>count2) {
		
		return true;
		
       }else {
	return false;
}}}