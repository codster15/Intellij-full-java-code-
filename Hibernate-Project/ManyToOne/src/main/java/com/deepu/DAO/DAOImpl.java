package com.deepu.DAO;

import com.deepu.Entity.Loan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAOImpl implements DaoInterface{

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");



    @Override
    public void save(Loan loan) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try{
            entityManager.merge(loan);
            transaction.commit();
            System.out.println("Object Persisted into DataBase");
        }catch(Exception e){
            transaction.rollback();
            System.out.println("Object is Not Persisted In to DataBase");
        }


    }

    @Override
    public Loan fetchById(Integer loanId) {

        EntityManager entityManager = factory.createEntityManager();
        Loan loan = entityManager.find(Loan.class, loanId);

        entityManager.close();
        return loan;
    }

    @Override
    public void remove(Integer loanId) {

    }
}
