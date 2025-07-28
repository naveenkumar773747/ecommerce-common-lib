package com.ecommerce.shared.events;

import com.ecommerce.shared.enums.DeliveryTypeEnum;
import com.ecommerce.shared.enums.OrderStatusEnum;
import com.ecommerce.shared.model.BillingInfo;
import com.ecommerce.shared.model.CartItem;
import com.ecommerce.shared.model.DeliveryInfo;
import lombok.Data;

import java.util.List;

@Data
public class OrderEvent {
    private String orderId;
    private String userId;
    private List<CartItem> items;
    private double totalAmount;
    private DeliveryInfo deliveryInfo;
    private BillingInfo billingInfo;
    private DeliveryTypeEnum deliveryTypeEnum;
    private OrderStatusEnum status;
    private String createdDateTime;
}