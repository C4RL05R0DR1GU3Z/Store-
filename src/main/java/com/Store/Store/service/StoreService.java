package com.Store.Store.service;

import com.Store.Store.controller.dto.StoreDto;
import com.Store.Store.repository.document.Store;

public interface StoreService
{
    Store create (Store store);
    Store findById(String id);
    Store update(Store store, StoreDto storeDto);
    boolean delete (String id);
}
