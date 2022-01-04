package com.example.database.service.company;

import com.example.database.domain.company.BookEntity;
import com.example.database.repository.company.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // 2-e
    public int avgPrice() {
        return bookRepository.avgPrice();
    }

    // 2-d
    public BookEntity save(BookEntity bookEntity) {
        bookRepository.saveOne(
                bookEntity.getIsbn(),
                bookEntity.getTitle(),
                bookEntity.getYear(),
                bookEntity.getPrice()
        );
        return bookEntity;
    }

    // 2-e
    public List<Object[]> avgPriceByYear() {
        return bookRepository.avgPriceByYear();
    }

    // 2-g
    public List<Object[]> findBook(String stock) {
        return bookRepository.findBook(stock);
    }

    public void updateBook(int price, String stock) {
        bookRepository.updateBook(price, stock);
    }
}
