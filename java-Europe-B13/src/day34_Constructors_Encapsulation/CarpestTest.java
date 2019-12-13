package day34_Constructors_Encapsulation;

public class CarpestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Floor fl = new Floor(5, 10);
        Carpet cpt = new Carpet(10);
        Calculator calc = new Calculator(fl, cpt);
        System.out.println(calc.getTotalCost());
	}

}
