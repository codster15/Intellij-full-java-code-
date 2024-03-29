package com.deepu.Dao;

import com.deepu.Entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDaoImpl implements BookDAO_Interface{


    EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");


    @Override
    public void saveBook(Book book) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try{
            entityManager.merge(book);
            transaction.commit();
            System.out.println("Object Persisted in Database");


        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
            System.out.println("Object not Persisted");


        }finally {
            entityManager.close();
        }

    }

    @Override
    public Book findBook(Integer BookID) {
        EntityManager entityManager = factory.createEntityManager();
        Book book = entityManager.find(Book.class, BookID);
        entityManager.close();
        return book;
    }

    @Override
    public void removeBook(Integer bookId) {

        EntityManager entityManager = factory.createEntityManager();
        Book book = entityManager.find(Book.class, bookId);
        entityManager.remove(book);
        entityManager.close();

    }
}
