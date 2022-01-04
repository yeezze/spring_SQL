package com.example.database.repository.company;

import com.example.database.domain.company.AuthorEntity;
import com.example.database.domain.company.AuthorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, AuthorId> {

    // 2-d
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO AUTHOR VALUES (:name, :address, :url)",
            nativeQuery = true
    )
    void saveOne(
            @Param("name") String name,
            @Param("address") String title,
            @Param("url") String year
    );
}
