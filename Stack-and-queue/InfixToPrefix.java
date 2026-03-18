import java.util.Stack;

public class InfixToPrefix {
    static int priority(char op){
      if(op == '*' || op== '/') return 2;
      if(op == '+' || op == '-') return 1;
      return 0;
        }

        static String reverse(String s){
            StringBuilder sb = new StringBuilder(s);

            sb.reverse();

            //!swap the braces
            for(int i =0; i<sb.length() ; i++){
                 char ch =sb.charAt(i);
                if(sb.charAt(i)== ')'){
                            sb.setCharAt(i, '(');
                }
                else if(ch =='('){
                        sb.setCharAt(i, ')');
                }
            }

            return sb.toString();
        }
    static String infixtoprefix(String s){
          s= reverse(s);
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

           else if(ch == ')'){
    while (!stack.isEmpty() && stack.peek() != '(') {
        result += stack.pop();
    }
    stack.pop(); // remove '('
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

        return new StringBuilder(result).reverse().toString();
    }
    public static void main(String[] args) {
         String s = "(A+B)*C";
         System.out.println(infixtoprefix(s));

    }
}
