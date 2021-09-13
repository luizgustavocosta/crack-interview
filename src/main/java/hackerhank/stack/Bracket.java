package hackerhank.stack;


import java.util.Stack;

public class Bracket {

    public static void main(String[] args) {

        System.out.println(isValid("[{{()}}]"));
        System.out.println(isValid("[{(}]"));
    }

    public static boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();
        for (char character : text.toCharArray()) {
            if (character == '[' || character == '{' || character == '(') {
                stack.push(character);
            } else if (character == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (character == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else if (character == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
        }
        return stack.isEmpty();
    }
}
