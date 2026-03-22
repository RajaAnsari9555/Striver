import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextgreaterElement(int[] nums1, int nums2[]) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // ! iterate our first nums1
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(current, -1);
            } else {
                map.put(current, stack.peek());
            }
            stack.push(current);
        }

        // ! make a result for storing the result
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] ans = nextgreaterElement(nums1, nums2);
        System.out.print("Next greater element");
        for (int num : ans) {
            System.out.println(num + " ");
        }

    }
}