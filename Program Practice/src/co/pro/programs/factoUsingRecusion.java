package co.pro.programs;

public class factoUsingRecusion {
    public static void main(String[] args) {




        System.out.println(output(5));

    }



   public static int output(int n){

        if(n == 1){
            return 1;
        }else{
            return n * output(n-1);
        }

    }

}
