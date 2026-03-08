public class maxInArray {

    static int max = Integer.MIN_VALUE;

    public static void maxInArray(int[] arr, int index) {

        // base case
        if (index == arr.length) {
            return;
        }

        // self work
        if (arr[index] > max) {
            max = arr[index];
        }

        // recursive call
        maxInArray(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {4, 32, 42, 6};

        maxInArray(arr, 0);

        System.out.println(max);
    }
}