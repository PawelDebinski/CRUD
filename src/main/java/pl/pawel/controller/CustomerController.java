package pl.pawel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String AddCustomer() {

        return "customer-form";
    }

    @GetMapping("delete/{id}")
    public String deleteCustomer(Model model, @PathVariable(required = true, name = "id") Long id) {
        customerService.deleteCustomer(id);

        return "redirect:/customers";
    }

}
