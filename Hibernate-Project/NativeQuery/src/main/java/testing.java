import com.deepu.EmpDAO.EmpDAO;
import com.deepu.Entity.EmpEntity;
import com.deepu.impl.EmpDapImpl;

import java.util.List;

public class testing {
    public static void main(String[] args) {
        EmpDAO emp = new EmpDapImpl();


//        List<EmpEntity> location = emp.fetchAllEMp("Lucknow");
//
//        System.out.println(location.size());
//        location.stream().forEach(e-> System.out.println(e.name()));


        int update = emp.update(3, 65000);

        System.out.println(update);
        if(update > 0){
            System.out.println("records updated successfully in DB");
        }else{
            System.out.println("Insertion Failed");
        }

    }
}