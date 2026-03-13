import java.util.*;

public class impementStackUsingQueue {

    Queue<Integer> q;

    public impementStackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);

        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

        impementStackUsingQueue stack = new impementStackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());

        System.out.println("Pop: " + stack.pop());

        System.out.println("Top after pop: " + stack.top());

        System.out.println("Is Empty: " + stack.empty());
    }
}