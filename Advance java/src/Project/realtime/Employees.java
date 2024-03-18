

package Project.realtime;
import java.sql.*;
import java.util.Scanner;

public class Employees {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
       EnterTOFetchData();

    }
//-------------------------------------------------------------------------------------
    static void EnterTOFetchData () throws SQLException {


                                                            //dep
        System.out.println("Enter the dep");
        String dep = sc.nextLine();
        if(dep.isEmpty()){
            dep = "empty";
        }

                                                            //gender
        System.out.println("Enter the Gender");
        String gender = sc.nextLine();
        if(gender.isEmpty()){
            gender = "empty";
        }
                                                             //location
        System.out.println("Enter the Work location");
        String location = sc.nextLine();
        if(location.isEmpty()){
            location = "empty";
        }


        String arr[] = {dep , gender , location};

         retreiveData(arr);



    }


    static void retreiveData(String[] arr) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Employees";
        String uname = "root";
        String pwd = "Deepak@12345";
        StringBuilder ExeQuery = new StringBuilder("select * from Employees where 1=1");

                //where emp_dept = 'admin'";
        //------------------------------
        String empDep = new String(arr[0]);
        String empGen = new String(arr[1]);
        String empLoc = new String(arr[2]);


       Connection con =  DriverManager.getConnection(url, uname ,pwd);



        if(!empDep.equals("empty") ){
            ExeQuery.append(" and emp_dept = ? ");
        }

        if(!empGen.equals("empty")){
            ExeQuery.append(" and emp_gender = ? ");

        }
        if(!empLoc.equals("empty")){
            ExeQuery.append(" and emp_Location = ? ");
        }





        PreparedStatement stmt = con.prepareStatement(ExeQuery.toString());

            int count = 1;
        if(!empDep.equals("empty") ){
            stmt.setString(count , empDep);
            count++;
        }
        if(!empGen.equals("empty")){
            stmt.setString(count , empGen);
            count++;

        }
        if(!empLoc.equals("empty") ){
            stmt.setString(count , empLoc);

        }


        ResultSet rows = stmt.executeQuery();
        while(rows.next()){
            System.out.println(rows.getInt(1) + " " + rows.getString(2) + "  " + rows.getInt(3)+
                    "  "+ rows.getString(4 ) + "  " +rows.getString(5) + "  " + rows.getString(6) );
        }
        con.close();

    }


}
