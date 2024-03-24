package com.deepu.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Tbl_Category")
public class CategoryEntity {




    @Id
    @Column(name = "Category_id")
   private Integer categoryID;

    @Column (name = "Category_Name")
    private String CategoryName ;


    @OneToMany( cascade = CascadeType.ALL ,  fetch = FetchType.EAGER )
       @JoinColumn (name = "Category_id_fk")

  private List<ProductEntity> lstOfProduct ;







//------------------------------------------------------------------------------------------------------------------
    public Integer categoryID() {
        return categoryID;
    }

    public CategoryEntity setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
        return this;
    }

    public String CategoryName() {
        return CategoryName;
    }

    public CategoryEntity setCategoryName(String categoryName) {
        CategoryName = categoryName;
        return this;
    }

    public List<ProductEntity> lstOfProduct() {
        return lstOfProduct;
    }

    public CategoryEntity setLstOfProduct(List<ProductEntity> lstOfProduct) {
        this.lstOfProduct = lstOfProduct;
        return this;
    }


    @Override
    public String toString() {
        return "CategoryEntity{" +
                "categoryID=" + categoryID +
                ", CategoryName='" + CategoryName + '\'' +
                ", lstOfProduct=" + lstOfProduct +
                '}';
    }
}
