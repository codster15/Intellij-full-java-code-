package BasicMaths;

public class pro1 {


    public static int test(int n) {
        int last;
        int count = 0;


        while (n > 0) {

            count++;
          n = n / 10;




        }
        return count;
    }

    public static void main(String[] args) {
       int res =  test(74559);
        System.out.println(res);
    }
}
