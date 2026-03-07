import java.util.HashMap;

public class FirstNonRepeating {
    public static char firstUnique(String s){
        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch :s.toCharArray()){
            map.put(ch , map.getOrDefault(ch ,0) +1);
        }

        for(int i = 0;i <s.length() ; i++){
            if(map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
         return '-';
    }
public static void main(String[] args) {
   String s = "leetcode";
   char result = firstUnique(s);
 if (result != '-') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
   
}
    
}