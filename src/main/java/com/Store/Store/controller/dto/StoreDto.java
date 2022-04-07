package com.Store.Store.controller.dto;

public class StoreDto
{
    private final String name;
    private final  long price;


    public StoreDto(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public long getPrice() {
        return price;
    }


}
