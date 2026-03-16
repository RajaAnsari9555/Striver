import java.util.Stack;

public class PrefixtoInfix {

    public static String prefixtoinfix(String s){
        Stack<String> stack = new Stack<>();

        for(int i = s.length()-1 ; i>=0; i--){
            char ch = s.charAt(i);

            //! for operands 
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            //!for operands

            else{
            String op1 = stack.pop();
            String op2 = stack.pop();

            String Expression = "("+op1+ch+op2+")";
            stack.push(Expression);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s= "*+ABC";
        System.out.print(prefixtoinfix(s));
    }
}