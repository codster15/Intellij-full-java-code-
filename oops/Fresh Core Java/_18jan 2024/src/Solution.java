

/*
Square and cube
*/

public class Solution {
    public static void main(String[] args) {
        int number = 3;

        Solution s = new Solution();
        s.sqr(number);
        s.cube(number);

        System.out.printf("%d - %d - %d", number, s.sqr(number), s.cube(number));
    }

    int sqr ( int number){
        number = number * number;

        return number;
    }

    int cube ( int number){
        number = number * number * number;

        return number;

    }
}
