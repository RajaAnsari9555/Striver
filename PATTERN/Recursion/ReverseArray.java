public class ReverseArray {
    static void function(int[] arr, int l, int r) {
        if (r <= l)
            return; // base case

        int temp = arr[l]; // swap
        arr[l] = arr[r];
        arr[r] = temp;

        function(arr, l + 1, r - 1); // recursive call
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        function(arr, 0, n - 1);

        System.out.println(java.util.Arrays.toString(arr));
    }
}
