package replIt;

import java.util.Arrays;

public class CatalogMain {

	public static void main(String[] args) {
		// TODO
		
Catalog a1=new Catalog();


a1.getItemsLessThanAMonthlyPrice(3000.00);

System.out.println(a1.getWholeCatalog());

System.out.println(a1.getItemDetails("iPhone 6s Plus"));
System.out.println(a1.getItemsLessThanAMonthlyPrice(10));

a1.deleteItemFromCatalog("Apple Watch");

	
	}

}
