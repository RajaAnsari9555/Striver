public class Fibonnaci {
    static int function(int n) {
        if (n <= 1) {
            return n;
        }
        return function(n - 1) + function(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = function(n);
        System.out.println(ans);
    }
}
