package model;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private double price;
    private int quantity;
    private UUID categoryId;

    public Product() {
        this.id = UUID.randomUUID();
    }

    public Product(String name, double price, int quantity, UUID categoryId) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.categoryId = categoryId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", categoryId=" + categoryId +
                '}';
    }
}
