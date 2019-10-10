package assignment2;

public class q1_bmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pounds,feet,inches;
		double heightMeters,mass,BMI;
		pounds=150;
		feet=5;
		inches=5;
		heightMeters = ((feet * 12) + inches ) * 0.0254;
		System.out.println(heightMeters);
		mass = (pounds/2.2);
		BMI = mass / (heightMeters * heightMeters);
		System.out.println("Your BMI is " + BMI);
		if(BMI<18.5) {
		System.out.println("Your risk category is underweight");
		}else if(BMI<25) {
		System.out.println("Your risk category is normal weight");
		}else if(BMI<30) {
		System.out.println("Your risk category is overweight");
		}else {
		System.out.println("Your risk category is obese");
		}

	}

}
