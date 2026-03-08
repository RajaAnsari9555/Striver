public class Printvalue {
    public static void printArray(int[] arr  , int index){
        //!base case
        if(index == arr.length){
            return;
        }

        //! self work
        System.out.println(arr[index]);

        //!recursive call
        printArray(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 3};

        printArray(arr , 0);
        
    }
}

