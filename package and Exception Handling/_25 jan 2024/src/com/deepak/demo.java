package com.deepak;

public class demo {
    void m2(int a , int b) throws Exception{  //  here we are passing the throws Exception to ignore compile time Exception  and now jvm will look who call this m2 method
        System.out.println("m2() - method  started");
        try{
            int c = a / b;
            System.out.println( " result - "+c);
        }catch(Exception e){
            throw new InvalidNumberException("invalid number");  // i am creating the Exception so compiler  will give waring for that exception .now we have to handle the exception by Passing
            // throws
            // keyword in method
          //  throw new InvalidNumberException("invalid number"); --> here  we are creating the user defined Exception  -- By taking another class of
            //-----------------------------------------------------------------
            //  package com.deepak;
            //
            //public class InvalidNumberException extends Exception {
            //    InvalidNumberException(String msg){
            //        super (msg); // passing the parameter to super class means passing to Exception class constructor   => Msg
            //
            //    }
            //}

            //------------------------------------------------------------

            // this is how we are creating the user defined Exception

        }


        System.out.println("m2() - method  Ended");

    }    void m1(int a , int b) throws Exception{ // now here jvm will check Is m1 method handling the exception or Ignoring  the Exception . So here we are ignoring the exception by passing throws
        // keyword . So now jvm will check who called the mi method
        System.out.println("m1() - method  started");
        m2(a, b );
        System.out.println("m1() - method  Ended");

    }

    public static void main(String[] args) {

        System.out.println("main () - Started");
// now here jvm will check the excetion occured in the m1 .So main method is handling the Exception or not .So finnal main method is handling the Exception
        try{
            demo d = new demo();
            d.m1(10 , 0);
        }catch (Exception e){ // the msg we pass ==>  throw new InvalidNumberException("invalid number"); that will be store in  ( e )  object of Exception class

            System.err.println(e);
        }

        System.out.println("main () - ended");
    }
}
