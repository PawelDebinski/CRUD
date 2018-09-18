package pl.pawel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pawel.dao.CustomerDao;
import pl.pawel.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    // == fields ==
    @Autowired
    CustomerDao customerDao;

    // == constructors ==
    public CustomerServiceImpl() {
    }

    // == public methods ==
    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return customerDao.getCustomerByName(name);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }
}
