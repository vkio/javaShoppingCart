public class ItemOrder {
	private int quantity;
	private Item item;
	
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	// price in ordered item
	public double getPrice() {
		return item.priceFor(quantity);
	}

	public Item getItem() {
		return item;
	}

}