import java.util.Stack;

public class InfixToPostfix{
    static int priority(char op){
        if(op == '*' || op=='/') return 2;
        if(op== '+' || op =='-') return 1;
        return 0;
    }
    public static void main(String[] args) {
        String s= "(A+B)*C";
        Stack<Character>stack = new Stack<>();

        String result = "";

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            //!for operand
            if(Character.isLetterOrDigit(ch)){
                result = result+ch;
            }

            //!for braces
          else  if(ch =='('){
                stack.push(ch);
            }

           else if(ch == ')' ){
            while (!stack.isEmpty() &&stack.peek() != ')') {
               result += stack.pop();
            }
            stack.pop();
           }

           //!for operator
           else{
            while(!stack.isEmpty() && priority(stack.peek()) >priority(ch)){
               result = result+ stack.pop();
               
            }
            stack.push(ch);
           }
        }
        while (!stack.isEmpty()) {
            result= result+stack.pop();
        }

System.out.println("Postfix: " + result);

    }
     
}