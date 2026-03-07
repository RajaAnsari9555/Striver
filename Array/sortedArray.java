public class sortedArray {
    public static boolean sortedArray(int[] nums){
        for(int i =1 ; i<nums.length; i++ ){
            if(nums[i] < nums[i-1]){
                 return false;
            }
          
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
        boolean result = sortedArray(nums);
      System.out.println(result ? "True" : "False");
    }
}
