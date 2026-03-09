import java.util.ArrayList;

public class indexArrayList {

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        // Base case
        if (index == arr.length) {
            return new ArrayList<>();
        }

        // Recursive call
        ArrayList<Integer> smallAns = findAllIndex(arr, target, index + 1);

        // Self work: if current element matches, add index
        if (arr[index] == target) {
            smallAns.add(0, index); // add at the front to maintain order
        }

        return smallAns;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 2};
        int target = 2;

        ArrayList<Integer> ans = findAllIndex(arr, target, 0);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}