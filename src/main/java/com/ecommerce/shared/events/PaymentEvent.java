package com.ecommerce.shared.events;

import com.ecommerce.shared.enums.OrderStatusEnum;
import com.ecommerce.shared.enums.PaymentTypeEnum;
import lombok.Data;

@Data
public class PaymentEvent {
    private String orderId;
    private String userId;
    private double totalAmount;
    private PaymentTypeEnum paymentTypeEnum;
    private OrderStatusEnum status;
    private String createdDateTime;
}
