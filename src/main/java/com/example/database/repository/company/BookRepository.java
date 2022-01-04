package com.example.database.repository.company;

import com.example.database.domain.company.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {

    // 2-d
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO BOOK VALUES (:isbn, :title, :year, :price)",
            nativeQuery = true
    )
    void saveOne(
            @Param("isbn") String isbn,
            @Param("title") String title,
            @Param("year") String year,
            @Param("price") String price
    );

    // 2-e 전체 평균
    @Query(
            value = "select avg(price)\n" +
                    "from book",
            nativeQuery = true
    )
    int avgPrice();

    // 2-e 년도별 평균
    @Query(
            value = "select round(avg(price)), year\n" +
                    "from book\n" +
                    "group by year\n" +
                    "order by year",
            nativeQuery = true
    )
    List<Object[]> avgPriceByYear();

    // 2-g 조회
    @Query(
            value = "select b.isbn, sum(s.num)\n" +
                    "from book b join stocks s\n" +
                    "on b.isbn = s.isbn\n" +
                    "where s.num >= :num\n" +
                    "group by b.isbn",
            nativeQuery = true
    )
    List<Object[]> findBook(@Param("num") String num);

    // 2-g 가격 할인
    @Modifying
    @Transactional
    @Query(
            value = "update book set price = price - (price * :price * 0.1)\n" +
                    "where isbn in (\n" +
                    "    select b.isbn\n" +
                    "    from book b join stocks s\n" +
                    "    on b.isbn = s.isbn\n" +
                    "    where s.num >= :stock)",
            nativeQuery = true
    )
    void updateBook(@Param("price") int price, @Param("stock") String stock);

}
