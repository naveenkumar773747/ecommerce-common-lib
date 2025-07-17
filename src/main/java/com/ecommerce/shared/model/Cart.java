package com.ecommerce.shared.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Document(collection = "carts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    private String id;

    private String userId;

    private List<CartItem> items = new ArrayList<>();

    public void addOrUpdateItem(CartItem newItem) {
        Optional<CartItem> existing = items.stream()
                .filter(item -> item.getProductId().equals(newItem.getProductId()))
                .findFirst();
        if (existing.isPresent()) {
            existing.get().setQuantity(existing.get().getQuantity() + newItem.getQuantity());
        } else {
            items.add(newItem);
        }
    }

    public void updateItem(String productId, int quantity) {
        items.stream()
                .filter(item -> item.getProductId().equals(productId))
                .findFirst()
                .ifPresent(item -> item.setQuantity(quantity));
    }

    public void removeItem(String productId) {
        items.removeIf(item -> item.getProductId().equals(productId));
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(i -> i.getPricePerUnit() * i.getQuantity())
                .sum();
    }
}
