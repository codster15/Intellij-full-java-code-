package com.deepu.StudentDAO;

import com.deepu.entity.CompositeKeyEntity;
import com.deepu.entity.StudentEntity;

public interface StudentDAO {


    void InsertInto_DB(StudentEntity student);

    StudentEntity FetchDATA_From_DB(CompositeKeyEntity compositeKey);



}
