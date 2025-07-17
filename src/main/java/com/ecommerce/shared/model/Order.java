package com.ecommerce.shared.model;

import com.ecommerce.shared.enums.OrderStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String orderId;
    private String userId;
    private List<CartItem> items;
    private double totalAmount;
    private DeliveryInfo deliveryInfo;
    private BillingInfo billingInfo;
    private OrderStatus status;
    private String createdDateTime;
}