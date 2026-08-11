import java.util.Deque;
import java.util.ArrayDeque;

public class StackReverse {

    public static String reverseCharacter(String original) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : original.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
    	
        String original = "Hello World";

        System.out.println("Original => " + original);

        String reversed = reverseCharacter(original);

        System.out.println("Reverse  => " + reversed);
    }
}