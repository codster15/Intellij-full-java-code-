package com.deepu.impl;

import com.deepu.dao.ProductDAO;
import com.deepu.entity.ProductEntity;

import javax.persistence.*;

public class ProductDAOImpl implements ProductDAO
{

    private EntityManagerFactory factory ;

    public ProductDAOImpl() {
       factory =  Persistence.createEntityManagerFactory("test");
    }

    //=========================================================================================================================  save
    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();

        tx.begin();

        try{
            entityManager.persist(product);
            tx.commit();
            System.out.println("Product is inserted to database");
        }catch (Exception e){
            tx.rollback();
            System.out.println("Product not inserted" + e);
        }
        finally {
            entityManager.close();
        }
        return product;
    }
//=========================================================================================================================load
    @Override
    public ProductEntity LoadProductByID(int productId) {
        EntityManager entityManager = factory.createEntityManager();
            //        find (): early load
            //    getReference() : lazy load


            ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);

        entityManager.close();



        return productEntity;
    }
//========================================================================================================================= update

    @Override
    public ProductEntity updateProductByID(int ProductID, Double newUnitPrice) {
        // Creates an EntityManager instance from the factory.
        EntityManager entityManager = factory.createEntityManager();

        // Finds the ProductEntity with the specified ProductID.
        ProductEntity productEntity = entityManager.find(ProductEntity.class, ProductID);

        // Begins a resource transaction.
        EntityTransaction transaction = entityManager.getTransaction();

        // Begins the transaction.
        transaction.begin();

        // Sets the new unit price on the found product entity.
        productEntity.setUnitPrice(newUnitPrice);

//        // Merges the changes made to the product entity back into the persistence context.
//        ProductEntity merge = entityManager.merge(productEntity);

        // Commits the transaction, persisting the changes to the database.
        transaction.commit();

        // Closes the EntityManager.
        entityManager.close();

        // Returns the merged (updated) product entity.
        return productEntity;
    }
//============================================================================================================================================== delete
    @Override
    public void deleteProductByID(int ProductID) {
        EntityManager entityManager = factory.createEntityManager();
        ProductEntity productEntity = entityManager.find(ProductEntity.class, ProductID);
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();





        try{
            entityManager.remove(productEntity);
            System.out.println("mission done");
            transaction.commit();
        }catch(Exception e ){
            transaction.rollback();
            System.out.println("Mission failed " + e);
            entityManager.close();

        }finally {
            entityManager.close();
        }


    }




}
