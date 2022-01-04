package com.example.database.service.company;

import com.example.database.repository.company.ContainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContainsService {
    @Autowired
    private ContainsRepository containsRepository;


}
