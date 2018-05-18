package validparentheses;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str){
        Stack stack = new Stack();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else{
                if(!stack.isEmpty() && isPairParentheses((Character) stack.peek(),ch)){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isPairParentheses(char left, char right){
        return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}';
    }
}
