package com.deepu.EmpDAO;

import com.deepu.Entity.EmpEntity;

import java.util.List;

public interface EmpDAO {

    List<EmpEntity> fetchAllEMp (String loc);

    int update(int id , int salary);


}
