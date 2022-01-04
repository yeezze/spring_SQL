package com.example.database.service.company;

import com.example.database.repository.company.ShoppingBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingBasketService {
    @Autowired
    private ShoppingBasketRepository shoppingBasketRepository;


}
