package com.ecommerce.shared.model;

import lombok.Data;

@Data
public class CartItem {
    private String productId;
    private String productName;
    private int quantity;
    private double pricePerUnit;
    private double totalPrice;
}