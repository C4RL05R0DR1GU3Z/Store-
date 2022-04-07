package com.Store.Store.service;

import com.Store.Store.controller.dto.StoreDto;
import com.Store.Store.repository.StoreRepositoryMongo;
import com.Store.Store.repository.document.Store;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceMongoDB implements StoreService
{
    private final StoreRepositoryMongo storeRepositoryMongo;

    public StoreServiceMongoDB(StoreRepositoryMongo storeRepositoryMongo) {
        this.storeRepositoryMongo = storeRepositoryMongo;
    }

    @Override
    public Store create(Store store) {
        return storeRepositoryMongo.save(store);
    }

    @Override
    public Store findById(String id) {
        return null;
    }

    @Override
    public Store update(Store store, StoreDto storeDto) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
