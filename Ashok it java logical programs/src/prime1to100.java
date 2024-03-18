


// best program of my life--hardwork pays off
// print prime number between 1 to 100

public class prime1to100 {

    public static void main(String[] args) {


        int no = 1;
        int count = 0;

       while(no <= 100){

           for (int i = 1; i <= no ; i++) {

               if(no % i == 0){

                    count++;

               }
           }
        if(count == 2){
            System.out.println("prime no - " + no);
        }
        count = 0;
        no++;

       }



    }

}
