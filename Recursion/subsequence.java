import java.util.ArrayList;

public class subsequence {

    public static ArrayList<String> getSSQ(String s) {

        ArrayList<String> ans = new ArrayList<>();

        // base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);

        ArrayList<String> smallans = getSSQ(s.substring(1));

        for (String ss : smallans) {
            ans.add(ss);            // not include current char
            ans.add(curr + ss);     // include current char
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> result = getSSQ(s);
        System.out.println(result);
    }
}