package pl.pawel.service;

import org.springframework.stereotype.Service;
import pl.pawel.entity.Customer;

import java.util.List;

@Service
public interface CustomerService {

    List<Customer> getAllCustomers();
    void addOrUpdateCustomer(Customer customer);
    Customer getCustomerById(Long id);
    Customer getCustomerByName(String name);
    void deleteCustomer(Long id);
}
