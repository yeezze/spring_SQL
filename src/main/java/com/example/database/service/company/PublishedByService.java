package com.example.database.service.company;

import com.example.database.repository.company.PublishedByRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishedByService {
    @Autowired
    private PublishedByRepository publishedByRepository;


}
