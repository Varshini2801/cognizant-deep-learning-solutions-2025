import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Simulating a data source
        customerData.put("C101", new Customer("C101", "Alice"));
        customerData.put("C102", new Customer("C102", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}
