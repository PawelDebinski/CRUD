package pl.pawel.dao;

import pl.pawel.entity.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomerById(int id);
    Customer getCustomerByName(String name);
    void deleteCustomer(int id);
}
