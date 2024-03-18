



package Project.realtime;
import java.sql.*;
import java.util.Scanner;
class bookStore{



    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        welcome();

    }

    static void welcome() throws SQLException, ClassNotFoundException {
        System.out.println("=====  Welcome to Book Store =====");
        System.out.println();
        EnterBookPrice();
    }

    static void EnterBookPrice() throws SQLException, ClassNotFoundException {
        System.out.println("Enter the book price below");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.isEmpty()){
            //here we have to display all books
            AllBooksFetch();
        }else {
            try{
                int inputvalue = Integer.parseInt(str);
                fetchBooks(inputvalue);
            }catch(NumberFormatException e){
                System.out.println("Enter only Integer");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    }


    static void fetchBooks(int userBookRate ) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/bookstore";
        String uname = "root";
        String pwd = "Deepak@12345";
        String ExeQuery = "select * from bookstore";

        //class loading
        Class.forName("com.mysql.cj.jdbc.Driver");


        //connection
          Connection con = DriverManager.getConnection(url , uname , pwd);

          Statement stmt = con.createStatement();

          ResultSet rs = stmt.executeQuery(ExeQuery);

        int count = 0;
            while(rs.next()){

                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);



                if(userBookRate > price){
                    System.out.println(id + "  "+name + "  "+ price);
                    count++;
                }if(count == 0){
                    System.out.println("Sorry No books available . Try next time");
                    count = 0;
                    return;
                }
            }



    }



     static  void AllBooksFetch() throws ClassNotFoundException, SQLException {
         String url = "jdbc:mysql://localhost:3306/bookstore";
         String uname = "root";
         String pwd = "Deepak@12345";
         String ExeQuery = "select * from bookstore";

         Class.forName("com.mysql.cj.jdbc.Driver");

         //connection
         Connection con = DriverManager.getConnection(url, uname, pwd);

         Statement stmt = con.createStatement();

         ResultSet rs = stmt.executeQuery(ExeQuery);


         while (rs.next()) {

             int id = rs.getInt(1);
             String name = rs.getString(2);
             int price = rs.getInt(3);
             System.out.println(id + "  "+name + "  "+ price);


         }

     }
}



//================================================================================================================

