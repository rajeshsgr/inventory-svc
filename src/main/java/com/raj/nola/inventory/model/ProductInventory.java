package com.raj.nola.inventory.model;

public class ProductInventory {

    private Product product;
    private Inventory inventory;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ProductInventory(Product product, Inventory inventory) {
        this.product = product;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "ProductInventory{" +
                "product=" + product +
                ", inventory=" + inventory +
                '}';
    }
}
