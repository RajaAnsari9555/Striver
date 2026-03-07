import java.util.*;

public class ReverseWord {
    public static String reverse(String s){
        StringBuilder result = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0){
            // skip spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
        
            if(i < 0){
                break;
            }

             int   j = i;
            // find words
            while( i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            String word = s.substring(i+1, j+1);
            if(result.length() > 0){
                result.append(' ');
            }
            result.append(word);
    }
    return result.toString();
}
    public static void main(String[] args) {
        String s = "  the   sky  is blue  ";
        System.out.print(reverse(s));
    }
}
