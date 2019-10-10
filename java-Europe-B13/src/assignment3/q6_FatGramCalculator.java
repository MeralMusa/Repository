package assignment3;

public class q6_FatGramCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalNumberOfCalories=30;
		double fatGrams=5;
		double caloriesFromFat;
		double percentageOfCaloriesFromFat;
		caloriesFromFat=fatGrams*9;
		percentageOfCaloriesFromFat=caloriesFromFat/totalNumberOfCalories;
		if(caloriesFromFat>totalNumberOfCalories) {
		System.out.println("The input is invalid");
		}else {
		if(caloriesFromFat<(0.3*totalNumberOfCalories)) {
		System.out.println("The food is low in fat ");
		}
		}

	}

}
