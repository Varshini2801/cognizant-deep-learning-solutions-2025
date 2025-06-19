public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Mouse", 50, 299.99);
        Product p2 = new Product(102, "Keyboard", 30, 599.49);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        inventory.updateProduct(101, "Wireless Mouse", 45, 349.99);

        System.out.println("\nAfter Update:");
        inventory.displayInventory();

        inventory.deleteProduct(102);

        System.out.println("\nAfter Deletion:");
        inventory.displayInventory();
    }
}
