public class Print1toN{
    public static void printNumber(int current  , int n) {
          if(current > n) {
            return;
 
          }
           System.out.println(current);
          printNumber(current+1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        Print1toN sol = new Print1toN();
        sol.printNumber(1 , n);
        System.out.println();
    }
}