package com.Store.Store.controller;



import com.Store.Store.controller.dto.StoreDto;
import com.Store.Store.repository.document.Store;
import com.Store.Store.service.StoreServiceMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController
{
   private  final StoreServiceMongoDB storeServiceMongoDB;

    public StoreController(@Autowired StoreServiceMongoDB storeServiceMongoDB) {
        this.storeServiceMongoDB = storeServiceMongoDB;
    }

    @PostMapping
    public Store create (@RequestBody StoreDto storeDto)
    {
        return storeServiceMongoDB.create(new Store(storeDto));
    }
}
