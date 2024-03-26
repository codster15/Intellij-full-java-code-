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
        }finally {

        }


    }

    @Override
    public Loan fetchById(Integer loanId) {
        return null;
    }

    @Override
    public void remove(Integer loanId) {

    }
}
