public class SumOfNum {
    // ! by parameters

    // static void function(int i, int sum) {
    // if (i < 1) {
    // System.out.print("TOtal Sum Is:" + sum);
    // return;

    // }
    // function(i - 1, sum + i);
    // }

    // public static void main(String[] args) {
    // int i = 5;
    // function(i, 0);
    // }

    // !by function

    static int function(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int md = n + function(n - 2);
            System.out.println(md); // optional: to see the intermediate sums
            return md;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = function(n);
        System.out.println("Total Sum is: " + sum);
    }
}
