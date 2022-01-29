public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        isValid("(){}");
        isValid("()");
        isValid("()(]{}");
        isValid("(]");
    }

    //use Stack (Java collection - LIFO: push,pop,empty,search,peek)
    public static boolean isValid(String s) {
        int i = 0;
        while (i < s.length()) {
            char leftPa = s.charAt(i);
            char rightPa = s.charAt(i + 1);
            i += 2;
            if (leftPa != rightPa) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
