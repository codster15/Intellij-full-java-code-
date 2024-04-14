package com.deepu.empDAOImpl;

import com.deepu.SqLQuery.SqlQuery;
import com.deepu.empDAO.EmpDAO;
import com.deepu.entity.EmployeeEntity;

import javax.persistence.*;
import java.util.List;

public class EmployeeDAOImpl implements EmpDAO {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
    @Override
    public EmployeeEntity FetchByID(int id) {
        EntityManager entityManager = factory.createEntityManager();

        TypedQuery<EmployeeEntity> query = entityManager.createQuery(SqlQuery.QueryByID, EmployeeEntity.class);
        query.setParameter(1 , id );
        EmployeeEntity singleResult = query.getSingleResult();

        entityManager.close();

        return singleResult;
    }
//---------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public List<EmployeeEntity> FetchEmployee() {

        EntityManager entityManager = factory.createEntityManager();

        TypedQuery<EmployeeEntity> query = entityManager.createQuery(SqlQuery.Queryemp, EmployeeEntity.class);
        List<EmployeeEntity> resultList = query.getResultList();

        entityManager.close();

        return resultList;
    }



    //----------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public List<Object[]> FetchByNameAndSalary() {

        EntityManager entityManager = factory.createEntityManager();


        TypedQuery<Object[]> query = entityManager.createQuery(SqlQuery.QueryByNameSal, Object[].class);
        List<Object[]> resultList = query.getResultList();

        entityManager.close();

        return resultList;
    }
}
