package com.deepu.StudentDAOImpl;

import com.deepu.StudentDAO.StudentDAO;
import com.deepu.entity.CompositeKeyEntity;
import com.deepu.entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDaoImpl implements StudentDAO {
    EntityManagerFactory Factory = Persistence.createEntityManagerFactory("test");
    @Override
    public void InsertInto_DB(StudentEntity student) {

        EntityManager entityManager = Factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        try{
            entityManager.persist(student);
            transaction.commit();
            System.out.println("Data Persisted in DB Successfully");

        }catch(Exception e){

            System.out.println("Insertion Failed " + e);
            transaction.rollback();
        }finally {

            entityManager.close();
        }


    }

    @Override
    public StudentEntity FetchDATA_From_DB(CompositeKeyEntity compositeKey) {

        EntityManager entityManager = Factory.createEntityManager();

        StudentEntity studentEntity = entityManager.find(StudentEntity.class, compositeKey);

        entityManager.close();
        return studentEntity;
    }
}
