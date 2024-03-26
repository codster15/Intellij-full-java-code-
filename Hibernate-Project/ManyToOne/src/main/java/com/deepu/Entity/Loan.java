package com.deepu.Entity;


import javax.persistence.*;

@Entity
@Table (name = "tbl_Loan")
public class Loan {

    @Id
    @Column(name = "Loan_ID")
    private  Integer loadID ;

    @Column (name = "Loan_Type")
    private  String loanType ;

    @Column( name = "Loan_Amount")
    private Integer LoanAmount;


    @ManyToOne (cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn (name = "Customer_id_fk")
    private Customer customer;
//----------------------------------------------------------------
    public Integer loadID() {
        return loadID;
    }

    public Loan setLoadID(Integer loadID) {
        this.loadID = loadID;
        return this;
    }

    public String loanType() {
        return loanType;
    }

    public Loan setLoanType(String loanType) {
        this.loanType = loanType;
        return this;
    }

    public Integer LoanAmount() {
        return LoanAmount;
    }

    public Loan setLoanAmount(Integer loanAmount) {
        LoanAmount = loanAmount;
        return this;
    }

    public Customer customer() {
        return customer;
    }

    public Loan setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
//-----------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Loan{" +
                "loadID=" + loadID +
                ", loanType='" + loanType + '\'' +
                ", LoanAmount=" + LoanAmount +
                '}';
    }
}
