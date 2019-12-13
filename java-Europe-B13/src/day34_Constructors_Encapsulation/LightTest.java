package day34_Constructors_Encapsulation;

public class LightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Creating Light object no.1");
		Light l1 = new Light();
		
		System.out.println("----------------------------");
		
		System.out.println("Creating Light object no.2");
		Light l2 = new Light(250, true);
		
		System.out.println("----------------------------");
		
		System.out.println("Creating Light object no.3");
		Light l3 = new Light(250,true,"attic");
	}

}
