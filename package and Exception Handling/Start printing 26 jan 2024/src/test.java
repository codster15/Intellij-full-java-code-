public class test {
    public static void check(int n ){

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-2*i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }


    }
    public static void main(String[] args) {
        check(7);
    }
}
