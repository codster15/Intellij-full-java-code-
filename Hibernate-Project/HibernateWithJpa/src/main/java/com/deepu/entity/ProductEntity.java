package com.deepu.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table (name = "tbl_products")
public class ProductEntity {

    public int productID() {
        return productID;
    }

    public ProductEntity setProductID(int productID) {
        this.productID = productID;
        return this;
    }

    public String ProductName() {
        return ProductName;
    }

    public ProductEntity setProductName(String productName) {
        ProductName = productName;
        return this;
    }

    public int quantity() {
        return quantity;
    }

    public ProductEntity setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Double unitPrice() {
        return unitPrice;
    }

    public ProductEntity setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public LocalDateTime createdOn() {
        return createdOn;
    }

    public ProductEntity setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public LocalDateTime updatedOn() {
        return updatedOn;
    }

    public ProductEntity setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    @Id
    @Column (name = "product_id")
    private int productID;

    @Column(name = "product_name")
    private String ProductName;

    private int quantity;

    @Column (name = " unit_price")
    private Double unitPrice;

    @Column(name = "Created_ON")
    @CreationTimestamp
    private LocalDateTime createdOn;

    @Column(name = "LASTUPDATED_ON")
    @UpdateTimestamp
    private LocalDateTime updatedOn;


    @Override
    public String toString() {
        return "ProductEntity{" +
                "productID=" + productID +
                ", ProductName='" + ProductName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                '}';
    }


}