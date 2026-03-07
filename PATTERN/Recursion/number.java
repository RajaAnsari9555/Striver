

public class number {
    static void function(int i, int n) {
        if (i <= n) {
            System.out.println(i);
            function(i + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        function(1, n);
    }
}
