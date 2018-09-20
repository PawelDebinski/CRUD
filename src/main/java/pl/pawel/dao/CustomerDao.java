package pl.pawel.dao;

import pl.pawel.entity.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();
    void saveOrUpdateCustomer(Customer customer);
    Customer getCustomerById(Long id);
    Customer getCustomerByName(String name);
    void deleteCustomer(Long id);
}
