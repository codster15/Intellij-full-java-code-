package BasicRecurssion;
// print in reverse order
//5 4 3 2 1
public class pro3 {

    public static int count = 0;

    public static void sol(int n){


        if(count >= n){
            return;
        }
        System.out.print(n - count + " ");
        count++;



        sol(n);

    }

    public static void main(String[] args) {

        sol(5);
    }

}
