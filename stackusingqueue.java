import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {
        private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    
    public MyStack() {
    }
    
    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1.add(x);
        
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        if (empty()) {
            return -1;
        }

        return q1.remove();
    }
    
    public int top() {
        if (empty()) {
            return -1;
        }

        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}