package com.example.database.repository.company;

import com.example.database.domain.company.ShoppingBasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasketEntity, String> {

}
