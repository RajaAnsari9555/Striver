import java.io.Serial;

public class LinearSearch {
static boolean Search(int[] arr , int target , int index){
    //! base case
    if(index >= arr.length){
        return false;
    }

    //! self work
    if(arr[index] == target){
        return true;
    }

    //! recursive call
    return Search(arr, target, index+1);
}
    public static void main(String[] args) {
        int [] arr ={1 ,2 ,4,5};
        int target = 4;
        if(Search(arr, target, 0)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}