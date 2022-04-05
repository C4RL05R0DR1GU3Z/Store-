package com.Store.Store.repository;

import com.Store.Store.repository.document.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepositoryMongo extends MongoRepository<Store,String>
{

}
