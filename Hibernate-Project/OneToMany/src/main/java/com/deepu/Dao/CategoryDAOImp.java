package com.deepu.Dao;

import com.deepu.entity.CategoryEntity;

import javax.persistence.*;
import java.util.List;

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

    //=======================================================================================================================

    @Override
    public CategoryEntity FetchEntity(Integer categoryID) {

        EntityManager entityManager = factory.createEntityManager();
        CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class, categoryID);

        factory.close();


        return categoryEntity;
    }

    //===============================================================================================================================


    @Override
    public void removeCategoryEntity(Integer categoryID) {

    }

    @Override
    public void testJoinQuery() {
        EntityManager entityManager = factory.createEntityManager();
        String query = "Select c.CategoryName , p.ProductName from CategoryEntity c join c.lstOfProduct p";

        TypedQuery<Object[]> query1 = entityManager.createQuery(query, Object[].class);

        List<Object[]> resultList = query1.getResultList();

                resultList.forEach(obj -> {
                    System.out.println(obj[0] + "\t" + obj[1]);
                });


    }
}
