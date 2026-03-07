public class Palindrome {
    static boolean Palindrome(int i , String s){
        if (i >= s.length()/2){
            return true;
              }
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
            return Palindrome(i+1, s);
    }
    public static void main(String[] args) {
        String s = "racecar";
        boolean ans = Palindrome(0, s);
        System.out.println(ans);
    }
}
