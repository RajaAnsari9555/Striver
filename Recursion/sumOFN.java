public class sumOFN {
     public static int printsumOfN(int n){

        if(n == 0){
            return 0;
             
        }
        return n + printsumOfN(n-1);
     }
    public static void main(String[] args) {
      int result =  printsumOfN(3);
      System.out.println(result);
    }
}
