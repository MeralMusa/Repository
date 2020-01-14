package TCMAXX;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Item spiele=new Item("monopoly",100,127283728,188.44);
		
		System.out.println(spiele.toString());

		System.out.println(spiele.getQuantity());
		spiele.setQuantity(200);
		System.out.println(spiele.getQuantity());

		System.out.println(spiele.getCatalogNumber());
		
		System.out.println(spiele.getPrice());

		spiele.setPrice(5.89);
		System.out.println(spiele.getPrice());
		
		System.out.println(spiele.toString());
		
		
		OnSaleItem spieledisc=new OnSaleItem("monopoly",100,127283728,188.44,20);
	
		System.out.println("---------------------------------------------");
		
		
		System.out.println(spieledisc.getDiscount());

		spieledisc.getDiscount();
		
		System.out.println(spieledisc.getPrice());
		System.out.println(spieledisc.toString());
		
		System.out.println("---------------------------------------------");

		
		TJMaxx list=new TJMaxx();
		
		list.addOnSaleItem(spieledisc);
		System.out.println(Arrays.asList(list.getAllItemNames()));
	}
	
	

}
