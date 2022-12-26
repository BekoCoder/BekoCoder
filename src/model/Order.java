package model;

import java.util.UUID;

public class Order {
    private UUID productId;
    private UUID userId;
    private int quantity;

    public Order() {
    }

    public Order(UUID productId, UUID userId, int quantity) {
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
