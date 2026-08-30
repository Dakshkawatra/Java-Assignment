class Product {

    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCount = 0;

    // Constructor with zero quantity
    Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    // Constructor with supplied quantity
    Product(String code, String name, double unitPrice, int quantity) {

        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        productCount++;
    }

    // Add stock
    void restock(int amount) {
        if (amount < 0) {
            System.out.println("Restock amount cannot be negative.");
            return;
        }

        quantity += amount;
    }

    // Sell product
    boolean sell(int amount) {
        if (amount < 0 || amount > quantity) {
            return false;
        }

        quantity -= amount;
        return true;
    }

    // Calculate total inventory value
    double getInventoryValue() {
        return unitPrice * quantity;
    }

    // Return number of products created
    static int getProductCount() {
        return productCount;
    }

    @Override
    public String toString() {
        return "Code: " + code +
               ", Name: " + name +
               ", Price: " + unitPrice +
               ", Quantity: " + quantity;
    }
}