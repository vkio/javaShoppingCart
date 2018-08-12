import java.util.ArrayList;

// Stores information about collection of items
public class Catalog {
	private String name;
	private ArrayList<Item> list;

	public Catalog(String name) {
		this.name = name;
		this.list = new ArrayList<Item>();
	}

	// add item at the end of the list
	public void add(Item item) {
		list.add(item);
	}

	// return the number of items in the list
	public int size() {
		return list.size();
	}
   
	// return item with its index
	public Item get(int index) {
		return list.get(index);
	}
	
	// return the name of this catalog
	public String getName() {
		return name;
	}
}