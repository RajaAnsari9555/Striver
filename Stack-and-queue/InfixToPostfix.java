import java.util.Stack;

public class InfixToPostfix{
    static int priority(char op){
        if(op == '*' || op =='/') return 2;
        if(op == '+' || op == '-') return 1;
        return 0;
    }
    public static void main(String[] args) {
        String s= "(A+B)*C";
        Stack<Character>stack = new Stack<>();
        String result = "";

        for(int i =0; i<s.length() ; i++){
            char ch = s.charAt(i);

            //!operand
            if(Character.isLetterOrDigit(ch)){
                result = result + ch;
            }
            //! '('

            if(ch == '('){
                stack.push(ch);
            }

            //! ')'

            else if(ch ==')'){
                while(stack.peek() != '('){
                 result= result+stack.pop();
                }
                stack.pop();
            }

            //! operator

            else {
                while(!stack.isEmpty() && priority(stack.peek()) > priority(ch)){
                    result = result+stack.pop();
                }
                stack.push(ch);
            }
        }
               //!remaining operators
        while (!stack.isEmpty()) {
            result = result+stack.pop();
        }

        System.out.println(result);


    }
}