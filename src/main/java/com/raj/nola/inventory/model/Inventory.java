package com.raj.nola.inventory.model;

import java.time.LocalDate;

public class Inventory {

    int productId;
    int availableQuantity;
    LocalDate updatedAt;

    public Inventory(int productId, int availableQuantity, LocalDate updatedAt) {
        this.productId = productId;
        this.availableQuantity = availableQuantity;
        this.updatedAt = updatedAt;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productId=" + productId +
                ", availableQuantity=" + availableQuantity +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
