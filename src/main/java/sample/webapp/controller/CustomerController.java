package sample.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;

import sample.webapp.repository.CustomerRepository;
import sample.webapp.repository.entity.CustomerEntity;

import java.util.List;
import java.util.ArrayList;

@Controller
public class CustomerController {
    
    private final CustomerRepository repo;
    
    @Autowired
    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customer")
    public String getCustomer(@RequestParam(name="customerList", required=false) List<CustomerEntity> customerList, Model model) {
        customerList = repo.findAll();
        model.addAttribute("customerList", customerList);
        model.addAttribute("newcustomer", new CustomerEntity());
        return "customer";
    }

    @PostMapping("/customer")
    public String addCustomer(@ModelAttribute CustomerEntity customer, Model model) {
        repo.save(customer);
        return "redirect:/customer";
    }
}