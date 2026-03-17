import java.util.Stack;

public class PostfixToInfix {
public static String postfixtoinfix(String s){
    Stack<String>stack = new Stack<>();
    for(int i =0; i<s.length(); i++){
        char ch = s.charAt(i);
        //!for operand
        if(Character.isLetterOrDigit(ch)){
            stack.push(ch+"");
        }

        //!for operator
        else{
            String op1 = stack.pop();
            String op2 = stack.pop();
            
            String expression = op1+ch+op2;
            stack.push(expression);
        }
    }
    return stack.pop();
}
public static void main(String[] args) {
    String s= "AB+C*";
    System.out.println(postfixtoinfix(s));
}
    
}