package TCMAXX;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

/**
 * Private lists to hold regular Item objects
 * and OnSaleItem objects that represent items that sell in TJMaxx
 */
private List<Item> regularItems;
private List<OnSaleItem> onSaleItems;
int regCount=-1;
int saleCount=-1;

/**
 * Public no-args constructor - Instantiates regularItems and onSaleItems lists
 * as new ArrayList
 */
public TJMaxx() {
    //TODO
	regularItems=new ArrayList<Item>();
	onSaleItems= new ArrayList<OnSaleItem>();
    
}

/**
 * adds an item object to regularItems list
 * @param item
 */
public void addRegularItem(Item item) {
   
	this.regularItems.add(item);
	regCount++;
   
}

/**
 * adds OnSaleItem object to onSaleItems list
 * @param item
 */
public void addOnSaleItem(OnSaleItem item) {
	this.onSaleItems.add(item);
    saleCount++;
}

/**
 * getter for regularItems
 * @return
 */
public List<Item> getRegularItems() {
    //TODO change from null 
    return regularItems;
}

/**
 * getter for onSaleItems
 * @return
 */
public List<OnSaleItem> getOnSaleItems() {
     //TODO change from null 
    return onSaleItems;
}

/**
 * return count of regularItem object
 * @return
 */
public int regularItemsCount() {
     //TODO change from -1 
    return regCount;
}
/**
 * returns count of onSaleItems in TJ Maxx
 * @return
 */
public int onSaleItemsCount() {
    //TODO change from -1 
    return saleCount;
}

/**
 * returns the name of each item in TJ Maxx starting
 * from regular item then onSaleItems
 * @return
 */
public List<String> getAllItemNames() {
   
	List<String> result=new ArrayList<String>();
	
	for(int i=0; i<regularItemsCount(); i++) {
		result.add(regularItems.get(i).getName());
	}
	
	for(int i=0; i<onSaleItemsCount(); i++) {
		result.add(onSaleItems.get(i).getName());
	}
   
   
   return result;
}

/**
 * gets catalog number and returns price for the item
 * it will search for the item both regularItems and onsaleonSaleItems
 * @param catalogNumber
 * @returns 0.0 if product cannot be found with that catalognumber
 */
public double getItemPrice(int catalogNumber){
	
	for(int i =0; i<regularItems.size(); i++) {
		if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
			return regularItems.get(i).getPrice();
		}
	}
	
	for(int i =0; i<onSaleItems.size(); i++) {
		if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
			return onSaleItems.get(i).getPrice();
		}
	}
   
    return 0.0;
}

/**
 * accepts a name then searches
 * amoung onSaleItems. Once it finds, the method will return
 * that OnSaleItem object
 * @param name
 * @return
 */
public OnSaleItem getOnSaleItem(String name){
	
	for(int i =0; i<onSaleItems.size(); i++) {
		if(onSaleItems.get(i).getName().equals(name)) {
			return onSaleItems.get(i);
		}
	}    
    
    return null;
}

/**
 * removes the item with matching catalogNumber
 * from both regularItems and onSaleItems.
 * Does nothing if not found
 * @param catalogNumber
 */
public void removeItem(int catalogNumber) {
	
	for(int i =0; i<regularItems.size(); i++) {
		if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
			regularItems.remove(i);
		}
	}
	
	for(int i =0; i<onSaleItems.size(); i++) {
		if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
			onSaleItems.remove(i);
		}
	}
    
}

/**
 * - it accepts a catalog number and finds that item
 * among regularItems and onSaleItems
 * - if it finds the item:
 *   - decrease the count of the Item by 1
 *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
 *
 * @param catalogNumber
 */
public void buyItem(int catalogNumber) {
    
	for(int i =0; i<regularItems.size(); i++) {
		if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
			if (regularItems.get(i).getQuantity()>0) {
				int quantity=regularItems.get(i).getQuantity();
				regularItems.get(i).setQuantity(quantity-1);
				if(quantity==0) {
					removeItem(catalogNumber);
				}
			}
		}
	}


	for(int i =0; i<onSaleItems.size(); i++) {
		if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
			if (onSaleItems.get(i).getQuantity()>0) {
				int quantity=onSaleItems.get(i).getQuantity();
				onSaleItems.get(i).setQuantity(quantity-1);
				if(quantity==0) {
					removeItem(catalogNumber);
					
				}
			}
			
		}
		
	}
	
}

}