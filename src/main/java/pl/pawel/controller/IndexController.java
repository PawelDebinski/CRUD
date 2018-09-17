package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showMainPage() {
        System.out.println("In da controller yo");
        return "index";
    }
}
