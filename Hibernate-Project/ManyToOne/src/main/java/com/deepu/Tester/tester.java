package com.deepu.Tester;

import com.deepu.DAO.DAOImpl;
import com.deepu.DAO.DaoInterface;
import com.deepu.Entity.Customer;
import com.deepu.Entity.Loan;

public class tester {
    public static void main(String[] args) {

        Loan homeLoan = new Loan();
        homeLoan.setLoadID(101);
        homeLoan.setLoanType("Home Loan");
        homeLoan.setLoanAmount(250000);

        Loan MarriageLoan = new Loan();
        MarriageLoan.setLoadID(102);
        MarriageLoan.setLoanType("Marriage Loan");
        MarriageLoan.setLoanAmount(150000);

        Loan PersonalLoan = new Loan();
        PersonalLoan.setLoadID(103);
        PersonalLoan.setLoanType("Personal Loan");
        PersonalLoan.setLoanAmount(50000);


        Customer c = new Customer();
        c.setCustomerID(10000);
        c.setCustomerName("john");


        // setting the same customer to all the loans
        homeLoan.setCustomer(c);
        MarriageLoan.setCustomer(c);
        PersonalLoan.setCustomer(c);



        DaoInterface dao = new DAOImpl();
        dao.save(homeLoan);
        dao.save(MarriageLoan);
        dao.save(PersonalLoan);




    }
}
