package com.example.database.service.company;

import com.example.database.repository.company.BasketOfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketOfService {
    @Autowired
    private BasketOfRepository basketOfRepository;

}
