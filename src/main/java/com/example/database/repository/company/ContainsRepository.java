package com.example.database.repository.company;

import com.example.database.domain.company.ContainsEntity;
import com.example.database.domain.company.ContainsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainsRepository extends JpaRepository<ContainsEntity, ContainsId> {

}
