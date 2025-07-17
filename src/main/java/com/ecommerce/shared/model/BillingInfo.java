package com.ecommerce.shared.model;

import lombok.Data;

@Data
public class BillingInfo {
    private String billingName;
    private String billingEmail;
    private String billingPhone;
    private String billingAddress;
    private String paymentMethod;
}