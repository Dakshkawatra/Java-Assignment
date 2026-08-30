public class ProductInventory {

    public static void main(String[] args) {

        // Creating products using both constructors
        Product p1 = new Product("P301", "Wireless Mouse", 650);
        Product p2 = new Product("P302", "Mechanical Keyboard", 1850, 8);
        Product p3 = new Product("P303", "Laptop Bag", 1200, 5);

        System.out.println("PRODUCT INVENTORY");
        System.out.println("-----------------");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Restocking products independently
        p1.restock(15);
        p3.restock(4);

        // Selling products independently
        System.out.println("\nSales:");
        System.out.println("Mouse sale successful: " + p1.sell(6));
        System.out.println("Keyboard sale successful: " + p2.sell(3));
        System.out.println("Laptop bag sale successful: " + p3.sell(12));

        // Updated quantities
        System.out.println("\nUpdated Inventory:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Inventory values
        System.out.println("\nInventory Values:");
        System.out.println("Mouse: " + p1.getInventoryValue());
        System.out.println("Keyboard: " + p2.getInventoryValue());
        System.out.println("Laptop Bag: " + p3.getInventoryValue());

        // Shared static counter
        System.out.println("\nTotal products created: "
                + Product.getProductCount());
    }
}
