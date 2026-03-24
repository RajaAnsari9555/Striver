import java.util.Stack;

public class NextGreaterCircular {

    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // loop 2 times for circular effect
        for (int i = 2*n - 1; i >= 0; i--) {

            int current = nums[i % n];

            // remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // fill result only in first pass
            if (i < n) {

                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }

            // push current element
            stack.push(current);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3};

        int[] ans = nextGreaterElements(nums);

        System.out.println("Next Greater Circular Elements:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}