/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjpa;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wayne.Hu
 */
@RestController
@RequestMapping("/url")
public class CustomerController {
    @Autowired
    CustomerRepository cr;        
    
    @RequestMapping(value="/", produces="application/json") 
    public List<Customer> getCustomer() {
        Iterable<Customer> iterable = cr.findAll();
        ArrayList<Customer> list = new ArrayList<Customer>();
        if(iterable != null) {
            for(Customer e: iterable) {
                list.add(e);
            }
        }     
        return list;
    }

}
