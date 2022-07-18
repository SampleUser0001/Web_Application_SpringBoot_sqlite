package sample.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import sample.webapp.entity.Customer;
import sample.webapp.repository.CustomerRepository;
import java.util.List;

@Controller
public class CustomerController {
    
    private final CustomerRepository repo;
    
    @Autowired
    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customer/findAll")
    public String getCustomer(@RequestParam(name="customerList", required=false) List<Customer> customerList, Model model) {
        customerList = repo.findAll();
        model.addAttribute("customerList", customerList);
        return "customer";
    }
    
    // @PostMapping("/customer/add")
    // public String addCustomer((@RequestParam("newcustomer")) Customer newCustomer, Model model) {
    //     repo.save(newCustomer);
    //     return getCustomer(new ArrayList<Customer> customerList, model);
    // }
}