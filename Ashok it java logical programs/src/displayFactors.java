

//Print all the factor of given number

public class displayFactors {

    static void factor(int no){



        for (int i = 1; i <= no ; i++) {

           if(no % i == 0){
               System.out.println("factor - " + i);

           }

        }
    }

    public static void main(String[] args) {
        factor(24);

    }

}
