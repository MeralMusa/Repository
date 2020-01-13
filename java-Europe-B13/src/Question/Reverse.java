package Question;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StrReverse2("halo du"));
		System.out.println(Reverse("halo du"));
	}
	public static String StrReverse2(String str) {

		String reverse="";

		for(int i=str.length()-1; i >= 0; i--) {

		reverse += str.toCharArray()[i];
		 System.out.println(reverse);


		}
		return  reverse;

}
	
	public  static String  Reverse(String str) {

		return new StringBuffer(str).reverse().toString();

		}
}
