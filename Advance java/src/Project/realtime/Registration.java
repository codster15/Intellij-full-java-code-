


package Project.realtime;

import com.mysql.jdbc.Driver;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class Registration {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        menu();
       // loginData();

    }

    static void menu() throws SQLException, ClassNotFoundException {
        System.out.println();
        System.out.println("  ------------                   Welcome to the Codster World    ------------------------------");

        System.out.println();
        System.out.println();

        //---------------------------

        System.out.println("     Select Any One   -------- ");
        System.out.println();
        System.out.println();

        System.out.println(" 1 => for Registraion -----> type 'res' in small letters");

        System.out.println(" 2 => for login-----> 'log' in small letters");
        System.out.println();

        registrationAndLogin();
    }

    //------------------------------------------------------------------------------------------------------------
    //                                                                                                                      Select Registration or Login


    static void registrationAndLogin() throws SQLException, ClassNotFoundException {

        System.out.println("Type Below --");

        Scanner sc = new Scanner(System.in);
        String read = sc.nextLine();
        String res = read;

        if (res.equals("res")) {
            //System.out.println("Registraion done");
            EnterRegistration();
        } else if (res.equals("log")) {
            // System.out.println("login done ");
            loginData();

        } else {
            System.out.println("Plz type the correct option");
            menu();
        }
    }


    //-------------------------------------------------------------------------------------
    //                                                                                                                      Enter Registration details
    static void EnterRegistration() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("          Registration Form");
        System.out.println();
        System.out.print("Enter name - ");
        String name = sc.nextLine();


        System.out.print("Enter email - ");
        String email = sc.nextLine();


        System.out.print("Enter Password - ");
        String password = sc.nextLine();

        ;

        System.out.print("Enter Date of Birth - ");
        String dateOfBirth = sc.nextLine();


        System.out.print("Enter Phone no - ");
        long phoneNo = sc.nextLong();
        System.out.println();
        System.out.println();

        //-----------------------------------------
        String registrationDataArr[] = {name, email, password, dateOfBirth, String.valueOf(phoneNo)};

 // email validate
        String url = "jdbc:mysql://localhost:3306/registration";
        String uname = "root";
        String pwd = "Deepak@12345";
        String fetch = "Select * from users ";

           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection con = DriverManager.getConnection(url , uname , pwd);

        Statement stmt = con.createStatement();

                 ResultSet rs  =  stmt.executeQuery(fetch);

                 while(rs.next()){
                     String emailcheck = rs.getString("email_id");

                     if(emailcheck.equals(email)){

                         System.err.println("Email already exist . Plz enter the new email for Registration ");

                         System.exit(0);
                     }


                 }




       registrationDataInsert(registrationDataArr);


//------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println();

        System.out.println(" Do you want to login --> type  'yes' or  'no'  in small letters");
        Scanner scan = new Scanner(System.in);
        String YesORNo = scan.nextLine();

        if (YesORNo.equals("yes")) {
            loginData();
        } else if (YesORNo.equals("no")) {
            System.exit(0);
        } else {
            System.out.println("plz type correct option only");
        }
    }





    //-------------------------------------------------------------------------------------
    //                                                                                                                   Registration data store in database
    static void registrationDataInsert(String resgisData[]) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/registration";
        String uname = "root";
        String pwd = "Deepak@12345";
//------------------------------------------------------------------------------
        String Res_name = resgisData[0];
        String Res_email = resgisData[1];
        String Res_pass = resgisData[2];
        String Res_dob = resgisData[3];
        long Res_phn = Long.parseLong(resgisData[4]);


        String updateData = "insert into users (user_name , email_id , user_pwd ,date_of_birth , phone_no) values (?,?,?,?,?)";
        //-----------      J D B C   --------------------------------------------


        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(url, uname, pwd);
             PreparedStatement stmt = con.prepareStatement(updateData);) {


            //set the values

            stmt.setString(1, Res_name);
            stmt.setString(2, Res_email);
            stmt.setString(3, Res_pass);
            stmt.setString(4, Res_dob);
            stmt.setLong(5, Res_phn);

            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("              Congratulation Your Registration done ");
            } else {
                System.out.println(" failed ");
            }


            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Could not connect with data base ");
        }



    }

//Enter Email ID - Krish@gmail.com
//
//Enter Password - Krish@12345



//-------------------------------------------------------------------
//                                                                                                                         enter the login credential
    static void loginData() throws ClassNotFoundException, SQLException {
        Scanner loginScan = new Scanner(System.in);

        System.out.println();
        System.out.println("           Login form");
        System.out.println();
//enter the Email
        System.out.print("Enter Email ID - ");
        String emailEnter = loginScan.nextLine();


//enter the password
        System.out.print("Enter Password - ");
        String PasswordEnter = loginScan.nextLine();
        System.out.println();

        //==================================
        //database data Fetch

        String url = "jdbc:mysql://localhost:3306/registration";
        String uname = "root";
        String pwd = "Deepak@12345";
        String fetch = "select * from users";
        int count = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url , uname , pwd);

        Statement stmt = con.createStatement();

        ResultSet rs =  stmt.executeQuery(fetch);

        while(rs.next()){
            String email_id = rs.getString("email_id");
            String user_pwd = rs.getString("user_pwd");

              if(emailEnter.equals(email_id) && PasswordEnter.equals(user_pwd)){
                    count++;
                  break;
              }


        }
                    if(count > 0){


                        System.out.println();
                        System.out.println();
                        System.out.println(" ========     Welcome to coding world     =======");
                    }else{

                        System.err.println("email not found  or invalid credianials");
                    }

        con.close();


            //deepaksingh.desire@gmail.com
            //deepak@123435

            //raj@gmail.com
            //Raj@122343

            //jack@gmail.com
            //jack@12345

            //alexa@gmail.com
            //alex@13123

            //bravo@gmail.com
            //bravo@12345

    }


}