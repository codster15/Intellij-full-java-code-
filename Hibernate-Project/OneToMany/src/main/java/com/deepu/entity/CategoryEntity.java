package com.deepu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_category")
public class CategoryEntity {

    @Id
    @Column(name = "Category_id")
    Integer categoryID;





}
