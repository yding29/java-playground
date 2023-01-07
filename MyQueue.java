import java.util.*;

public class MyQueue {
    // Implementing queue with stack (String only)
    private Stack<String> stack = new Stack<>();
    private Stack<String> myQueue = new Stack<>();


    public MyQueue(Queue<String> queue) {
        Stack<String> temp = new Stack<>(); // this temporary stack will (see the second while loop below)
        while (!queue.isEmpty()) {
            temp.push(queue.poll());
        }
        stack = temp; // stores
        while (!temp.empty()) {
            // pops every element of the temp stack into the "faked" myQueue
            // the stack in the field is reserved for methods like poll() that requires the original queue/stack
            myQueue.push(temp.pop());
        }
    }


    // the print() method prints every element of the stack that is "faked" to be the actual queue
    public void print() {
        Stack<String> temp = myQueue;
        while (!temp.empty()) {
            System.out.println(temp.pop());
        }
    }


    // polls out the first element of myQueue just like
    public String poll() {
        String ret = myQueue.pop(); //
        Stack<String> temp = myQueue;
        stack.clear();

        // updates the stack in the private field after polling out the 1st element in myQueue
        while (!temp.empty()) {
            stack.push(temp.pop());
        }
        return myQueue.pop();
    }

    public String add(String s) {
        stack.push(s);
        myQueue.clear();
        while (stack.empty() == false) {
            myQueue.push(stack.pop());
        }
        return s;
    }
    public boolean empty() {
        return myQueue.empty();
    }
}
