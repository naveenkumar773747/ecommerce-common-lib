package com.ecommerce.shared.events;

import com.ecommerce.shared.model.BillingInfo;
import com.ecommerce.shared.model.CartItem;
import com.ecommerce.shared.model.DeliveryInfo;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderPlacedEvent {
    private String orderId;
    private String userId;
    private List<CartItem> items;
    private double totalAmount;
    private DeliveryInfo deliveryInfo;
    private BillingInfo billingInfo;
    private String createdDateTime;
}