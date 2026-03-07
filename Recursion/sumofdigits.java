public class sumofdigits {

    public static int SOD(int n){

        // base case
        if(n >= 0 && n <= 9){
            return n;
        }

        return SOD(n/10) + n%10;
    }

    public static void main(String[] args) {

        int n = 23423;

        int result = SOD(n);

        System.out.println(result);
    }
}