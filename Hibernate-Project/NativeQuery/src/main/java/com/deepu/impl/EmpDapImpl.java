package com.deepu.impl;

import com.deepu.EmpDAO.EmpDAO;
import com.deepu.Entity.EmpEntity;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.util.List;

public class EmpDapImpl implements EmpDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");



    @Override
    public   List<EmpEntity> fetchAllEMp(String loc) {

        EntityManager entityManager = factory.createEntityManager();

        String query = "select * from emp where location = ?1";

        Query nativeQuery = entityManager.createNativeQuery(query , EmpEntity.class);

        nativeQuery.setParameter(1,loc);
        List resultList = nativeQuery.getResultList();

        entityManager.close();


        return resultList;
    }

    @Override
    public int update(int id , int salary) {

        String qur = "update emp set salary = ?1  where id = ?2";

        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Query nativeQuery = entityManager.createNativeQuery(qur);

        nativeQuery.setParameter(1 , salary);
        nativeQuery.setParameter(2 , id);

        int i = 0;

        try{
             i = nativeQuery.executeUpdate();
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
        }finally {
            entityManager.close();
        }



        return i;
    }
}
