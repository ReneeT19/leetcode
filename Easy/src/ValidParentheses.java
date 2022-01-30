import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(){}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()(]{}"));
        System.out.println(isValid("(]"));
    }

    //use Stack (Java collection - LIFO: push,pop,empty,search,peek)
    public static boolean isValid(String s) {
        //declare a stack object of Char
        Stack<Character> characterStack = new Stack<>();

        //loop through the string and push closing bracket when detecting a valid opening bracket
        //use push to add element to the bottom of the stack
        //use pop to check the element on the top of the stack
        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                characterStack.push(')');
            } else if(ch == '{') {
                characterStack.push('}');
            } else if (ch == '[') {
                characterStack.push(']');
            //| does not do short-circuit evaluation in boolean expressions.
            //|| will stop evaluating if the first operand is true
            } else if(characterStack.isEmpty() || ch != characterStack.pop()) {
                return false;
            }
        }
        return characterStack.isEmpty();
    }
}
