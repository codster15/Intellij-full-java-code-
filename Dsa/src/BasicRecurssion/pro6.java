package BasicRecurssion;

public class pro6 {
    public static void main(String[] args) {
        int arr[] = {2,6,1,9,5};


        for (int i = 0; i < arr.length/2 ; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;

        }
        for(int x : arr){
            System.out.print(x);
        }

    }
}