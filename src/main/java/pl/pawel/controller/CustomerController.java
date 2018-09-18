package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/customers")
    public String showCustomers() {
        System.out.println("In da controller yo");
        return "customers";
    }
}
