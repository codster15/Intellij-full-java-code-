

//Program - Develop jdbc application to read employee id from the keyboard and retrieves employee data along with address.

package Assignment;

import java.sql.*;
import java.util.Scanner;

public class TransactionBasedProgram {
    public static void main(String[] args) throws SQLException {

        //insert_Data_Address();
        //Fetch_data_Address();
        bestWay_toFetch();

    }

    static void enterData (){
        System.out.println(" -------   WELCOME    --------");
        System.out.println();
        System.out.println();

        Scanner sc  = new Scanner(System.in);
        System.out.println("type 'ED' for employee data Insertion   or   type 'AD' for employee Address Insertion");
        String data = sc.next();



        if(data.equals("ED")){
           // EmpData();
        }else if(data.equals("AD")){
           // EmpAdd();
        }else{
            System.out.println("Incorrect Type");

        }

    }

    static void insert_Data_Address() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/human";
        String uname = "root";
        String pwd = "Deepak@12345";
        String Insert_empData = "insert into employeeData values (? , ? , ? )";
        String Insert_Address = "insert into employeeAddress values ( ? , ? ,  ? , ? )";
        Scanner sc = new Scanner(System.in);
//for table 1
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name");
        String name = sc.next();

        System.out.println("Enter Employee Salary");
        int salary = sc.nextInt();

        //----------------------------------------------------------


  //for table 2
        System.out.println("Enter Employee city");
        String city = sc.next();

        System.out.println("Enter Employee State");
        String state = sc.next();

        System.out.println("Enter Employee Country");
        String Country = sc.next();

        Connection con = DriverManager.getConnection(url, uname, pwd);

            con.setAutoCommit(false);
        try{
            PreparedStatement pstmt = con.prepareStatement(Insert_empData);


            pstmt.setInt(1 , id);
            pstmt.setString(2 , name);
            pstmt.setInt(3, salary);
            pstmt.executeUpdate();

            pstmt = con.prepareStatement(Insert_Address);


            pstmt.setString(1 ,city );
            pstmt.setString(2 , state);
            pstmt.setString(3,Country);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();

            con.commit();

            System.out.println("Data Got Inserted");
        }catch(Exception e){
            e.printStackTrace();
            con.rollback();
            System.out.println("NOt Inserted");
        }

    }



    //My Method
    static void Fetch_data_Address() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/human";
        String uname = "root";
        String pwd = "Deepak@12345";
        String fetch_Data = "select * from employeeData where id = ? ";
        String fetch_Add = "select * from employeeAddress where id = ? ";

        //important condition for give emp data and emp Address based on given ID.
        String insertQuery = "select * from employeeData e , employeeAddress a   where e.id = a.id and e.id = ?;";


        System.out.println("Enter Employee ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        Connection con = DriverManager.getConnection(url, uname, pwd);

        PreparedStatement pstmt = con.prepareStatement(fetch_Data);


        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1) +" -- " + rs.getString(2 )+ " -- " + rs.getInt(3));
        }

           pstmt = con.prepareStatement(fetch_Add);
           pstmt.setInt(1, id);

        ResultSet rsAdd = pstmt.executeQuery();

        while(rsAdd.next()){
            System.out.println(rsAdd.getString(1) +" -- " + rsAdd.getString(2 )+ " -- " + rsAdd.getString(3));
        }


        con.close();


    }



    // this is ashok sir logic
    static void bestWay_toFetch() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/human";
        String uname = "root";
        String pwd = "Deepak@12345";
        String insertQuery = "select * from employeeData e , employeeAddress a   where e.id = a.id and e.id = ?;";


        System.out.println("Enter Employee ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        Connection con = DriverManager.getConnection(url, uname, pwd);

        PreparedStatement pstmt = con.prepareStatement(insertQuery);


        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1) +" -- " + rs.getString(2 )+ " -- " + rs.getInt(3) + " -- "
                    + rs.getString(4) +" -- " + rs.getString(5 )+ " -- " + rs.getString(6));
        }
        con.close();


    }
}

