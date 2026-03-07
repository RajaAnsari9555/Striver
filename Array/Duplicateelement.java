import java.util.Arrays;

public class Duplicateelement {
    public  int duplicate(int[] nums){
        int i =0;
        for(int j =1; j<nums.length; j++){
           
            if(nums[j] != nums[i]){
                 i++;
                nums[i] = nums[j];
                
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,4,6};
         Arrays.sort(nums);
         Duplicateelement obj = new Duplicateelement();
         int k = obj.duplicate(nums);
         for(int x =0; x<k; x++){
            System.out.println(nums[x]+" ");
         }
        
    }
}
