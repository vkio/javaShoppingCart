import java.text.*;

public class Item {
	private String name;
	private double price, bulkPrice;
	private int bulkQuantity;

	public Item(String name, double price) {
		throwIllegalArg(price);
		this.name = name;
		this.price = price;
	}

	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		throwIllegalArg((int)price & (int)bulkPrice & bulkQuantity);
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
	}

	// Determine regular price or bulk price
	public double priceFor(int quantity) {
		throwIllegalArg(quantity); 
		double totalPrice;
		if(!(bulkPrice > 0)) { // regular price
			 totalPrice = quantity * price;
		} else {
			totalPrice = (quantity / bulkQuantity * bulkPrice + (price * (quantity % bulkQuantity))); // bulk price
		}
		return totalPrice;
	}

	// String representation of items name, price, & bulk price with parenthesis, US dollar in 2 decimal places
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // floating point format
		String formatPrice = nf.format(price);
		String listName = name + ", " + formatPrice;
		if(bulkPrice > 0) { // bulk price String format
			String formatBulkPrice = nf.format(bulkPrice);
			listName += " ("+ bulkQuantity + " for "  + formatBulkPrice + ")";
		} 
		return listName;
	}

	//values can not be negative, throws IllegalArgumentException if negative
	private static void throwIllegalArg (double value) {
		if (value < 0) throw new IllegalArgumentException();
	}
	
}