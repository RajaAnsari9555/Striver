import java.util.Stack;

public class PostfixToPrefix {
    public static String postfixtoprefix(String s){
        Stack<String> stack= new Stack<>();

      for(int i = 0; i<s.length(); i++){
          char ch = s.charAt(i);
          

          //! operands
          if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
          }

          //!operators

          else{
            String op1 = stack.pop();
            String op2 = stack.pop();

            String expression =ch+op1+op2;

            stack.push(expression);
          }
      }
      return stack.pop();
        
    }
    public static void main(String[] args) {
       String s = "AB+C*";
       System.out.println(postfixtoprefix(s));
    }
}
