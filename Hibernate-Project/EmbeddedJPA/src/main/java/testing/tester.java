package testing;

import com.deepu.StudentDAO.StudentDAO;
import com.deepu.StudentDAOImpl.StudentDaoImpl;
import com.deepu.entity.CompositeKeyEntity;
import com.deepu.entity.StudentEntity;

public class tester {
    public static void main(String[] args) {



        CompositeKeyEntity compositeKey = new CompositeKeyEntity();
        compositeKey.setStudentRoll(102);
        compositeKey.setSection('A');

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName("Sanju Samson");
        studentEntity.setMarks(560);
        studentEntity.setCompositeKey(compositeKey);



        StudentDAO student = new StudentDaoImpl();
       // student.InsertInto_DB(studentEntity);

        StudentEntity studentEntity1 = student.FetchDATA_From_DB(compositeKey);

        System.out.println("=================================================");
        System.out.println();
        System.out.println(studentEntity1.name());

    }
}
