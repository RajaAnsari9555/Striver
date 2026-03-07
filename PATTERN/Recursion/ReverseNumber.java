public class ReverseNumber {
    static void function( int i , int n ){
        if (i < 1){
            return;
              }
            System.out.println(i);
            function(i-1, n);
      
    }
public static void main(String[] args) {
    int n = 3;
    function(n, n);
}
}
