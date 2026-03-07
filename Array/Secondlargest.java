public class Secondlargest{
    public static int Secondlargest(int[] nums) {
        int largest = -1;
        int secondlargest = -1;
        for(int i =0; i<nums.length; i++ ){
            if(largest < nums[i]){
                secondlargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondlargest && nums[i] != largest){
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] nums  = {7,6,3,29,34};
        int result = Secondlargest(nums);
        System.out.println("The Second Largest number is" + result);
    }
}