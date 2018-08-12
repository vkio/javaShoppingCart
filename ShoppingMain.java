// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
    public static void main(String[] args) {
        Catalog list = new Catalog("Shopping Cart");
        list.add(new Item("3/4 Socket", 3.95, 10, 19.99));
        list.add(new Item("9/16 socket", 3.50, 10, 14.95));
        list.add(new Item("Electrical Tape", 0.99));
        list.add(new Item("2 tons chain come along", 389.99));
        list.add(new Item("Wire stripper(insulated)", 49.99));
        list.add(new Item("18\" pipe wrench", 49.99));
        list.add(new Item("Sticky notes", 3.40));
        list.add(new Item("3/8 Ractchet", 9.10));
        list.add(new Item("LED flash light", 19.99));
        list.add(new Item("Small flat head screwdriver", 0.99, 10, 5.0));
        list.add(new Item("Small philips head screwdriver", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
