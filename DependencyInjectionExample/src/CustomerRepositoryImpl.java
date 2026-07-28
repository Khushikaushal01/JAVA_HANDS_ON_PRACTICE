public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        
        if (id == 1) {
            return "Customer [ID: 1, Name: Khushi Kaushal, Email: khushikaushal108@gmail.com]";
        } else if (id == 2) {
            return "Customer [ID: 2, Name: John Doe, Email: john.doe@example.com]";
        } else {
            return "Customer with ID: " + id + " not found.";
        }
    }
}
