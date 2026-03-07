import java.util.HashMap;

public class IsomorphicString {
    public static boolean IsomorphicString(String s , String t){
        if(s.length() != t.length()) return false;
        HashMap <Character , Character> MapST = new HashMap<>();
        HashMap <Character , Character> MapTS = new HashMap<>();
        for(int i =0; i< s.length() ; i++){
            char c1 =  s.charAt(i);
             char c2 =  t.charAt(i);
            // mapping  T to s
            if(MapST.containsKey(c1)){
                if(MapST.get(c1) != c2){
                    return false;
                }
            }
            else{
                MapST.put(c1, c2);
            }

            // mapping  S to T
             if(MapTS.containsKey(c2)){
                if(MapTS.get(c2) != c1){
                    return false;
                }
            }
            else{
                MapTS.put(c2, c1);
            }

        }
        return true;


    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(IsomorphicString(s ,t) ? "true" : false);
    }
}
