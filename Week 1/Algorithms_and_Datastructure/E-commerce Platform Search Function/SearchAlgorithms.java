import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    // Linear search
    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Binary search
    public static int binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "Book", "Stationery")
        };

        // Linear Search
        int linearIndex = linearSearch(products, "Shoes");
        System.out.println("Linear Search: Found at index " + linearIndex);

        // Sort before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        int binaryIndex = binarySearch(products, "Shoes");
        System.out.println("Binary Search: Found at index " + binaryIndex);
    }
}
