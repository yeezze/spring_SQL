package com.example.database.service.company;

import com.example.database.repository.company.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;


}
