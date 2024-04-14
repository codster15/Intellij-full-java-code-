package com.deepu.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_Customer")
public class Customer {

    @Id
    @Column (name = "Customer_ID")
    private Integer customerID;


    @Column (name = "customer_name")
    private String customerName;

    //------------------------------------------------------------------------------------
    public Integer customerID() {
        return customerID;
    }

    public Customer setCustomerID(Integer customerID) {
        this.customerID = customerID;
        return this;
    }

    public String customerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
