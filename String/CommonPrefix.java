import java.util.Arrays;
public class CommonPrefix {
    public static String common(String[] str){
      Arrays.sort(str);
      String First = str[0];
      String Last = str[(str.length-1)];

      int i =0;
      while(  i < First.length() && i< Last.length() && First.charAt(i) == Last.charAt(i)){
        i++;
      }
      return First.substring(0 ,i);


    }
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.print(common(str));
    }
}
