package com.example.database.service.company;

import com.example.database.domain.company.CustomerEntity;
import com.example.database.repository.company.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    // 2-c
    public List<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }
}
