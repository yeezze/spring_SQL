package com.example.database.repository.company;

import com.example.database.domain.company.StocksEntity;
import com.example.database.domain.company.StocksId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StocksRepository extends JpaRepository<StocksEntity, StocksId> {

    // 2-a
    @Query(
            value = "select b.title, sum(s.num)\n" +
                    "from stocks s join book b \n" +
                    "on s.isbn=b.isbn\n" +
                    "where s.isbn in (\n" +
                    "    select isbn from written_by\n" +
                    "    where name=:name)\n" +
                    "group by b.title",
            nativeQuery = true
    )
    List<Object[]> findStocksBywritten(@Param("name") String name);

    // 2-d
    // 2-d
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO STOCKS VALUES (:isbn, :code, :num)",
            nativeQuery = true
    )
    void saveOne(
            @Param("isbn") String isbn,
            @Param("code") String code,
            @Param("num") String num
    );
}
