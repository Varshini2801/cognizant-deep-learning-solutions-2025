public class DIApp {
    public static void main(String[] args) {
        // Create the repository (dependency)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.displayCustomerDetails("C101");
        System.out.println();
        service.displayCustomerDetails("C999");  // Non-existent
    }
}
