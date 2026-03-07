


public class Name {
    static void function(int i, int n) {
        if (i <= n) {
            System.out.println("MD Raja");

            function(i + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        function(1, n);
    }
}
