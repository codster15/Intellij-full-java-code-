package com.deepu.Dao;

import com.deepu.entity.CategoryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CategoryDAOImp implements CategoryDAO {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

    @Override
    public void saveCategory(CategoryEntity entity) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try{
            entityManager.persist( entity);
            transaction.commit();
            System.out.println("object Persisted in Database");

        }catch(Exception e){
            transaction.rollback();

            System.out.println("Error Occured - " + e.getMessage() );

            System.out.println("Object not Persisted in Database");
            e.printStackTrace();

        }finally {
            entityManager.close();
        }


    }

    @Override
    public CategoryEntity FetchEntity(Integer categoryID) {
        return null;
    }

    @Override
    public void removeCategoryEntity(Integer categoryID) {

    }
}
