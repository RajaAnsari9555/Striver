public class RotateArraybyOne {
    public void rotatearray(int[] nums){
        int n = nums.length;
        int temp = nums[0];
        for(int i =1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
    }
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    RotateArraybyOne obj = new RotateArraybyOne();
   obj.rotatearray(nums);
    for(int x = 0; x < nums.length; x++ ){
        System.out.println(nums[x] + "");
    }
  }
    
}