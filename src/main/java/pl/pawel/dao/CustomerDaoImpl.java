package pl.pawel.dao;

import org.springframework.stereotype.Repository;
import pl.pawel.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    // == fields ==
    @PersistenceContext
    private EntityManager em;

    // == constructors ==
    public CustomerDaoImpl() {
    }

    // == public methods ==
    @Override
    public List<Customer> getAllCustomers() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public void saveOrUpdateCustomer(Customer customer) {
        if (customer.getId() == null) {
            em.persist(customer);
        }else {
            em.merge(customer);
        }

    }

    @Override
    public Customer getCustomerById(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {
        Customer customer = em.find(Customer.class, id);
        em.remove(customer);
    }
}
