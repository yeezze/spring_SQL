package com.example.database.service.company;

import com.example.database.domain.company.StocksEntity;
import com.example.database.domain.company.WrittenByEntity;
import com.example.database.repository.company.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocksService {
    @Autowired
    private StocksRepository stocksRepository;

    // 2-a
    public List<Object[]> findStocksBywritten(String name) {
        return stocksRepository.findStocksBywritten(name);
    }

    // 2-d
    public StocksEntity save(StocksEntity stocksEntity) {
        stocksRepository.saveOne(
                stocksEntity.getIsbn(),
                stocksEntity.getCode(),
                stocksEntity.getNum()
        );
        return stocksEntity;
    }
}
