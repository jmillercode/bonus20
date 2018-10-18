package bonus20;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class ShoppingListApp {
	
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Map< String, Double> maps = new HashMap< String, Double>();
		List<String> itemList = new ArrayList<String>();
		List<Double> itemPriceList = new ArrayList<Double>();
		double itemPrice;
		String userInput;
		String userContinue = "yes";
		String spaces = "     ";
		int i = 0;
		boolean loop = true;
		maps.put("eggs", 2.49);
		maps.put("milk", 3.25);
		maps.put("bread", 3.10);
		maps.put("cheese", 1.50);
		maps.put("mango", 0.89);
		maps.put("coke 2 liter ", 1.10);
		maps.put("corn pops", 3.50);
		maps.put("oven pizza", 2.99);
		
		System.out.println("Menu:");
		for (Map.Entry<String, Double> map : maps.entrySet()) {
			System.out.println(map.getKey() + spaces + map.getValue());
		}
		while (userContinue == "yes"){
			loop = true;
			while (loop == true){
				System.out.println("what would you like to add to your cart?");
				userInput = scnr.nextLine();
				if (maps.containsKey(userInput) == true ){
					loop = false;
					itemPrice = maps.get(userInput);
					itemList.add( i, userInput);
					itemPriceList.add( i, itemPrice);
					++i;
				}
				else{
					System.out.println("not an item.");
				}
			}
			System.out.println("would you like to add another item to the cart?(yes/no)");
			userContinue = scnr.next();
		}
		System.out.println(itemList);
		
		
	}
}
