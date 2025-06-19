import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        products.put(product.productId, product);
    }

    // Update Product
    public void updateProduct(int productId, String name, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.productName = name;
            p.quantity = quantity;
            p.price = price;
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (products.remove(productId) == null) {
            System.out.println("Product not found.");
        }
    }

    // Display Inventory
    public void displayInventory() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
