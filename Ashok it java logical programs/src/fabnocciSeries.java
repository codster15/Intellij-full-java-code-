


// fabonacci series first 10 numbers
public class fabnocciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int count = 1;

        System.out.println(first);
        System.out.println(second);
        while(count <= 8){

            int sum = first + second;

            first = second;
            second = sum;
            System.out.println(sum);
            count++;

        }


    }


}
