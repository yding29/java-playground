import java.util.*;
public class MyStack {
    // Implementing stack with queue (String only)
    private Queue<String> queue = new LinkedList<>();
    private Queue<String> myStack = new LinkedList<>();

    public MyStack(Stack<String> stack) {
        Queue<String> temp = new LinkedList<>();
        while (stack.empty() == false) {
            temp.add(stack.pop());
        }
        queue = temp;
        while (temp.isEmpty() == false) {
            myStack.add(temp.poll());
        }
    }
}
