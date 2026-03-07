public class BubbleSort {
    static void bubbleSort(int arr[]){
        for(int turn =0; turn <= arr.length-2;turn++){
            for(int j=0; j<= arr.length-2-turn ;j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        printArr(arr);
    }
}
