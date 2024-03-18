package BasicRecurssion;
//print 1 to n
//1
//2
//3
//4
//5
public class pro1 {

     public static int count = 0;

    public static void sol(int n){


        if(count >= n){
            return;
        }
        count++;
        System.out.println(count);


        sol(n);


    }

        public static void backtracking(int n){

            if(count > n){
                return;
            }
            count++;
            backtracking(n);
            count--;


             if(count == 0){
                 return;
             }
            System.out.println(count);
        }

    public static void main(String[] args) {

            //sol(5);
            backtracking(5);
    }

}
