package co.pro.programs;







public class pro1 {

    int count = 0 ;
    int sum = 0;

    int sum() {
        count++;
        sum += count;


                if(count >= 10){
                   return sum;
                }


                    sum();
                   return sum;
    }

        public static void main(String[] args) {
        pro1 p = new pro1();
        int res = p.sum();
            System.out.println(res);
    }
}

//approach 1 using loop
//approach 2 using n * (n+1)/2
//approach 3 using Recursion
