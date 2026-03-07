import java.util.*;
public class letters{
    public static void letter(String str){
        for(int i =0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }
    public static void main(String[] args) {
       String firstName = "MD";
       String LastName = "Raja";
       String FullName = firstName + " " + LastName;
       letter(FullName);
    }
}