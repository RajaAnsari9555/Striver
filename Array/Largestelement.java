import java.util.*;

public class Largestelement {
    public static int largest(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] nums = {6,4,37,8};
        int result = largest(nums);
        System.out.println("The largest element is: " + result);
    }
}
