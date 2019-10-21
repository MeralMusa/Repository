package replIt;
import java.util.*;
public class shoppingList2 {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			
		String it="Item";
		
		String p="Price";
		String print="";
			int i=1;
			
			do {								

			System.out.println("Enter Item"+i+" and its price:");
				item=scan.nextLine();
				
				price=Double.parseDouble(scan.nextLine());
			    
				totalPrice+=price;
				
				
				print=it+i+": "+item+" "+p+": "+price+", ";
				
								shoppingListReport+=print;
				System.out.println("Add one more item?");

				countinue=scan.nextLine();			
				

				if(countinue.equalsIgnoreCase("no")||i==10) {
					break;
				}
       i++;
			}while(i<=10);				


		System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2));
		
		System.out.println("Total price: "+totalPrice);
	}}
         
                

         



		    
