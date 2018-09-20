package pl.pawel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pawel.entity.Customer;
import pl.pawel.service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {

    // == fields ==
    @Autowired
    CustomerService customerService;

    // == public methods ==

    @GetMapping("/customers")
    public String showCustomers(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customerList", customers);
        return "customers";
    }

    @GetMapping("add-customer")
    public String addCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "customer-form";
    }

    @GetMapping("edit{id}")
    public String editCustomer(@PathVariable(required = true, name = "id") Long id, Model model) {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer);

        return "customer-form";
    }

    @PostMapping("saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.addOrUpdateCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("delete/{id}")
    public String deleteCustomer(@PathVariable(required = true, name = "id") Long id) {
        customerService.deleteCustomer(id);

        return "redirect:/customers";
    }

}
