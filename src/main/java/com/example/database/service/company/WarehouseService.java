package com.example.database.service.company;

import com.example.database.repository.company.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;


}
