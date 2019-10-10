package assignment1;

public class swapValues {
	public static void main(String[] args) {
		
		
		//Solution-1 - >  By using 3rd variable
		
		int n1=10;int n2=20;
		
		
		int  n3;//Dummy variable
		
		n3=n1;
		n1=n2;
		n2=n3;
		
		System.out.println("n1:" + n1);
		
		System.out.println("n2:" + n2);
		
		
		//Solution-2 - > Without using 3rd variable
		
		int num1=20;int num2=30;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}
}
