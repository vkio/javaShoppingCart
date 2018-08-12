import java.util.*;

// Store all information of items that user chose
public class ShoppingCart { 
	private ArrayList<ItemOrder> itemOrders;
	private boolean discount;

	public ShoppingCart() {
		itemOrders = new ArrayList<ItemOrder>();
		discount = false;
	}
	
	public void add (ItemOrder order) {
		itemOrders.set(itemInIndex(order), order);
	}
	
	// Set discount
	public void setDiscount (boolean discount) {
		this.discount = discount;
	}
	
	// Total price of the entire shopping cart
	public double getTotal() {
		double total = 0;
		for (int i = 0; i < itemOrders.size(); i++) {
			total += itemOrders.get(i).getPrice();
		}	
		return (discount)? total * 0.9 : total;
	}

	//replaces a previous order of the same item when it exists
	int itemInIndex (ItemOrder order) {
		for (int i = 0; i < itemOrders.size(); i++) {
			if (itemOrders.get(i).getItem() == order.getItem()) {
				return i;
			}
		}
		itemOrders.add(null); 
		return itemOrders.size() - 1; 
	}
}
