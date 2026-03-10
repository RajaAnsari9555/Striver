import java.util.Scanner;

public class FindOccurence {
    static String removeA(String s ,int index){
        //! base case 
        if(index == s.length()){
            return "";
        }

        //!recursive work
        String smallAns = removeA( s,index+1);

        char curr = s.charAt(index);

        //! self work
       if(curr != 'a'){
    return curr + smallAns;
}
else{
    return smallAns;
}
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.print(removeA(s, 0));
}
    
}