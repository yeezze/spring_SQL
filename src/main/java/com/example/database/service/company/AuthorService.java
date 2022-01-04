package com.example.database.service.company;

import com.example.database.domain.company.AuthorEntity;
import com.example.database.domain.company.WrittenByEntity;
import com.example.database.repository.company.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    // 2-d
    public AuthorEntity save(AuthorEntity authorEntity) {
        authorRepository.saveOne(
                authorEntity.getName(),
                authorEntity.getAddress(),
                authorEntity.getUrl()
        );
        return authorEntity;
    }
}
