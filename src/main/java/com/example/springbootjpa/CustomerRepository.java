/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjpa;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wayne.Hu
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}
