public class FindallIndex {
    static void findallIndex(int[] arr ,int target , int index){
        //!base case
        if(index >= arr.length){
            return ;
        }

        //! self work
        if(arr[index] == target){
            System.out.println(index);
        }
        //! recursive call
        findallIndex(arr, target, index+1);

    }
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4,2,2};
        int target = 2;
        findallIndex(arr , target , 0);
    }
}
