package com.example.database.repository.company;

import com.example.database.domain.company.CustomerEntity;
import com.example.database.domain.university.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    // 2-c
    @Override
    @Query(
            value = "SELECT * FROM CUSTOMER",
            nativeQuery = true
    )
   List<CustomerEntity> findAll();

}
