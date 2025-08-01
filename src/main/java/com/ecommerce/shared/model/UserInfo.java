package com.ecommerce.shared.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
@Data
public class UserInfo {
    @Id
    private String userId;
    private String name;
    private String email;
    private List<DeliveryInfo> savedAddresses;
}