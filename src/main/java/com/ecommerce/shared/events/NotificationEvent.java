package com.ecommerce.shared.events;

import com.ecommerce.shared.enums.OrderStatusEnum;
import lombok.Data;

@Data
public class NotificationEvent {
    private String orderId;
    private String userId;
    private String billingName;
    private String billingEmail;
    private double totalAmount;
    private OrderStatusEnum status;
    private String createdDateTime;
}