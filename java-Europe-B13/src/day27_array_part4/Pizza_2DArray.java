package day27_array_part4;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
String[][] pizzas = {
				
				{"pinneapple","pepperoni"}, //row-0
				{"anchovies","mushroom","olives"}, //row-1
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
		
		//System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("###FOR EACH LOOP###");
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("###FOR ITERATOR LOOP###");
		for(int i=0;i<pizzas.length;i++) {
			System.out.print(pizzas[i].length);
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		System.out.println("----------------");
		
		
		for(String value : pizzas[3]) {
			
			System.out.println(value);
			
		}}}