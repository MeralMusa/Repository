package day26_array_part3;
import java.util.*;
public class MethodArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findCar(3,"Honda"));  //true
		
		}
		
		
		public static String[]  createArray(int arraySize) {
			
			
			Scanner sc  = new Scanner(System.in);
			
			String[] carArray = new String[arraySize];
			
			
			for(int i=0 ; i<carArray.length ; i++) {
				
				System.out.print("Enter your car #" + (i+1));
				carArray[i] = sc.next();
			}
			
			return carArray;
			
		}
		
		
		public static boolean findCar(int value,String toFindCar) {
			
			
			for(String car : createArray(value)) {
				
				if(car.equalsIgnoreCase(toFindCar)) {
					
					return true;
				}
			}
			
			return false;
			
		}
	
	
	
}
