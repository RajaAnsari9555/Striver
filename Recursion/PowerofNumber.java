public class PowerofNumber {
    public static int power(int p , int q){
        
        //!base condition 
        if(q == 0){
            return 1;
        }

        //!make reqursive  call
        int secondAns = power(p, q-1);
        int ans = secondAns * p;

        return ans;
    }
    public static void main(String[] args) {
        int result = power(5, 4);

        System.out.println(result);
    }
}
