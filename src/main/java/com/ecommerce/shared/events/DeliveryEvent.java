package com.ecommerce.shared.events;

import com.ecommerce.shared.enums.OrderStatusEnum;
import com.ecommerce.shared.model.BillingInfo;
import com.ecommerce.shared.model.DeliveryInfo;
import lombok.Data;

@Data
public class DeliveryEvent {
    private String orderId;
    private String userId;
    private DeliveryInfo deliveryInfo;
    private BillingInfo billingInfo;
    private OrderStatusEnum status;
    private String createdDateTime;
}
