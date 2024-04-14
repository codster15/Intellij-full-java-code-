package com.deepu.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table (name = "Tbl_Product")
public class ProductEntity {


    @Id
    @Column(name = "Product_ID")
    private Integer ProductId;

    @Column(name = "Product_name")
    private String ProductName ;

    @Lob
     @Column(name = "Product_Image")
   private byte[] ProductImg;

    //-----------------------------------------------------------------------------------



    public Integer ProductId() {
        return ProductId;
    }

    public ProductEntity setProductId(Integer productId) {
        ProductId = productId;
        return this;
    }

    public String ProductName() {
        return ProductName;
    }

    public ProductEntity setProductName(String productName) {
        ProductName = productName;
        return this;
    }

    public byte[] ProductImg() {
        return ProductImg;
    }

    public ProductEntity setProductImg(byte[] productImg) {
        ProductImg = productImg;
        return this;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "ProductId=" + ProductId +
                ", ProductName='" + ProductName +
                '}';
    }


}
