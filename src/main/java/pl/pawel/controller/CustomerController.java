package pl.pawel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
