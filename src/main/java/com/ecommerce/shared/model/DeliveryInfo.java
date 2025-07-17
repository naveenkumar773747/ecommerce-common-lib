package com.ecommerce.shared.model;

import lombok.Data;

@Data
public class DeliveryInfo {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String pincode;
    private String contactNumber;
}