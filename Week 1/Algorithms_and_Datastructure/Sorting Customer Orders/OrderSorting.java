public class OrderSorting {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    // Print orders
    public static void printOrders(Order[] orders, String title) {
        System.out.println("=== " + title + " ===");
        for (Order order : orders) {
            order.print();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(1, "Varshini", 4500.00),
            new Order(2, "Anil", 3200.50),
            new Order(3, "Divya", 8999.99),
            new Order(4, "Raj", 1500.00),
        };

        Order[] orders2 = orders1.clone();  // Copy for quick sort

        bubbleSort(orders1);
        printOrders(orders1, "Sorted by Bubble Sort");

        quickSort(orders2, 0, orders2.length - 1);
        printOrders(orders2, "Sorted by Quick Sort");
    }
}
