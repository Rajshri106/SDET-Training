package JavaTutorial;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("America");
        stack.push("Germany");
        stack.push("India");
        System.out.println("Stack: " + stack);
        System.out.println("popped element:" + stack.pop());
    }
}
