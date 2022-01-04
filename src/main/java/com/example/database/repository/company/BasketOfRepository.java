package com.example.database.repository.company;

import com.example.database.domain.company.BasketOfEntity;
import com.example.database.domain.company.BasketOfId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketOfRepository extends JpaRepository<BasketOfEntity, BasketOfId> {

}
