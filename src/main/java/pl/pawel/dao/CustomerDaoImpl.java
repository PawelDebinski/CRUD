package pl.pawel.dao;

import org.springframework.stereotype.Repository;
import pl.pawel.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    // == fields ==
    @PersistenceContext
    private EntityManager em;

    // == constructors ==
    public CustomerDaoImpl() {
    }

    @Override
    public List<Customer> getAllCustomers() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {

    }
}
