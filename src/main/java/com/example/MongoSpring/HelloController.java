package com.example.MongoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final customersRepository customersRepository;

    public HelloController(com.example.MongoSpring.customersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }


    @GetMapping("/save")
    public customers index() {
        customers customers=new customers("hosein","rasht");
        customersRepository.save(customers);
        return customers;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<customers> getAllUsers() {
        return customersRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
