package com.example.database.service.company;

import com.example.database.domain.company.BookEntity;
import com.example.database.domain.company.WrittenByEntity;
import com.example.database.domain.university.StudentEntity;
import com.example.database.repository.company.WrittenByRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrittenByService {
    @Autowired
    private WrittenByRepository writtenByRepository;

    // 2-c
    public List<Object[]> findcusinfo(String email) {
        return writtenByRepository.findcusinfo(email);
    }

    // 2-d
    public WrittenByEntity save(WrittenByEntity writtenByEntity) {
        writtenByRepository.saveOne(
                writtenByEntity.getName(),
                writtenByEntity.getAddress(),
                writtenByEntity.getIsbn()
        );
        return writtenByEntity;
    }

    // 2-f
    public List<Object[]> findbookinfo() {
        return writtenByRepository.findbookinfo();
    }
}
