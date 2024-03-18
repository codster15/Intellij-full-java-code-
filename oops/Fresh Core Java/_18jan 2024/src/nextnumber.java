import java.util.Scanner;

public class nextnumber {


//    increase number method;
    void increse(int no){
        no++;
        System.out.println("after - "+no);
    }

//    number equal check
    boolean equalcheck(int a , int b ){
        String n1 = "" + a;
        String n2 = "" + b;


        if(n1.equals(n2)){
            return true;
        }else{
            return false;
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//       int no =  sc.nextInt();
        nextnumber nn = new nextnumber();
//        nn.increse(no);

       boolean check =  nn.equalcheck(10, 10);

        System.out.println(check);

        String myString = "Hello, World!";
        String result = myString.toString();
        System.out.println(result);
    }
}
