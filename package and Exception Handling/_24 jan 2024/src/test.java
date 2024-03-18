public class test {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.println("this line will not be executed - " + c);
        }catch (ArithmeticException e){
            System.out.println("Catch block : divided by zero");

        }finally {
            System.out.println("I am from  finnally no one can stop me to to execute");
        }
        System.out.println("After execution is handled");

    }
}
