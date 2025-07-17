package com.ecommerce.shared.model;

import com.ecommerce.shared.enums.PaymentTypeEnum;
import lombok.Data;

@Data
public class BillingInfo {
    private String billingName;
    private String billingEmail;
    private String billingPhone;
    private String billingAddress;
    private PaymentTypeEnum paymentMethod;
}