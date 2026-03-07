import java.util.ArrayList;

public class subsequence {

    public static ArrayList<String> getSSQ(String s){

        ArrayList<String> ans = new ArrayList<>();

        // base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);

        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for(String ss : smallAns){
            ans.add(ss);           // exclude character
            ans.add(ss + curr);    // include character
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");

        for(String ss : ans){
            System.out.println(ss);
        }
    }
}