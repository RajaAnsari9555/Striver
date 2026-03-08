public class sumInArray {
    public static int sumInArray(int[] arr ,int index){


        //! base case
        if(index == arr.length){
            return 0;
        }

        //! recursive function
        int smallAns = sumInArray(arr, index+1);

        //! self work
        return smallAns+arr[index];
    }
    public static void main(String[] args) {
        int [] arr = {1 ,2 ,3 ,4};
       int result = sumInArray(arr, 0);
       System.out.println(result);
    }
}
