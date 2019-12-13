package day36_StaticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		
		//mom.takeASlice();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		
		
	}

}
