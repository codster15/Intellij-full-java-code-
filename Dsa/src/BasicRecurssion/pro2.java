package BasicRecurssion;
// print name n times
//deepak
//deepak
//deepak

    public class pro2 {

        public static int a = 1;

        static void f(int n){
            if(a > n){
                return;
            }
            System.out.println("deepak");
            a++;
            f(n);

        }

        public static void main(String[] args) {

            f(3);
        }
    }
