package com.drools.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private Double originalPrice;
    private Double realPrice;

    @Override
    public String toString() {
        return "Order{" +
                "originalPrice=" + originalPrice +
                ", realPrice=" + realPrice +
                '}';
    }
}