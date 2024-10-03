package inventory;

public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] items = {"Apples", "Bananas", "Carrots", "Detergent"};
	        
	        int[] quantities = {50, 30, 100, 25};

	        System.out.println("Inventory:");
	        for (int i = 0; i < items.length; i++) {
	            System.out.println(items[i] + ": " + quantities[i] + " in stock");
	        }
	}

}
