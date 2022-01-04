package com.example.database.repository.company;

import com.example.database.domain.company.WrittenByEntity;
import com.example.database.domain.company.WrittenById;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface WrittenByRepository extends JpaRepository<WrittenByEntity, WrittenById> {
    // 2-f
    @Query(
            value = "select w.name, count(w.isbn), max(b.price), min(b.price), avg(b.price)\n" +
                    "from written_by w join book b\n" +
                    "on w.isbn=b.isbn\n" +
                    "group by w.name",
            nativeQuery = true
    )
    List<Object[]> findbookinfo();

    // 2-c 특정 고객 선택시 정보 출력
    @Query(
            value = "select a.isbn, a.name as item1, w.name as item2, w.address\n" +
                    "from written_by w \n" +
                    "join (select c.isbn, p.name\n" +
                    "    from contains c join published_by p\n" +
                    "    on c.isbn = p.isbn\n" +
                    "    where c.basketid in \n" +
                    "        (select b.basketid from basket_of b\n" +
                    "         where email = :email)) a\n" +
                    "on w.isbn = a.isbn",
            nativeQuery = true
    )
    List<Object[]> findcusinfo(@Param("email") String email);

    // 2-d 새로운 정보 등록
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO WRITTEN_BY VALUES (:name, :address, :isbn)",
            nativeQuery = true
    )
    void saveOne(
            @Param("name") String name,
            @Param("address") String title,
            @Param("isbn") String isbn
    );
}
