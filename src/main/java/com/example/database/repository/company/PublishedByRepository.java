package com.example.database.repository.company;

import com.example.database.domain.company.PublishedByEntity;
import com.example.database.domain.company.PublishedById;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishedByRepository extends JpaRepository<PublishedByEntity, PublishedById> {

}
