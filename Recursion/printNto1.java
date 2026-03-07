public class printNto1 {
     public static void printNumber(int current  , int n) {
          if(current > n) {
            return;
 
          }
           
          printNumber(current+1, n);
          System.out.println(current);
    }
    public static void main(String[] args) {
        int n = 10;
        printNto1 sol = new printNto1();
        sol.printNumber(1 , n);
        System.out.println();
    }
}
