import java.util.Stack;

public class InfixToPostfix {

    public static int priority(char op){
         if(op == '*' || op =='/')return 2;
         if(op == '+' || op == '-') return 1;
         return 0;

    }
    public static void main(String[] args) {
        String s = "(A+B)*C";
        String result = "";
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            //!operands

            if(Character.isLetterOrDigit(ch)){
                result = result+ch;
            }
            //!for '('
            else if(ch == '('){
                stack.push(ch);
            }

            //! for ')'

            else if(ch == ')'){
               while(stack.peek() != '('){
                result= result+stack.pop();
            }
            stack.pop(); // remove the '('
            }
           
           //! for operators
           else {
           while(!stack.isEmpty() && priority(stack.peek()) >= priority(ch)){
                result = result + stack.pop();
            }
            stack.push(ch);
           }
        }
        // pop remaining operators
        while(!stack.isEmpty()){
            result = result+stack.pop();
        }
        System.out.println("postfix"+result);
    }
}