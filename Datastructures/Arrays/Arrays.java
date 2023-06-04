package Datastructures.Arrays;

public class Arrays {
    public static void main(String[] args) {
        //int[] arr = new int[3];
        int[] arr = {1, 2, 3};
        long sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println(sum);
        sum = 0;
        /* For-each Loop */
        for (int ind : arr) {
            sum += ind;
        }
        System.out.println(sum);
    }
}
