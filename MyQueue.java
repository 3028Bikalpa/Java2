import java.util.Stack;

public class MyQueue<E> {
    private Stack<E> stack1;
    private Stack<E> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enQueue(E e) {
        stack1.push(e);
    }

    public E deQueue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return stack2.pop();
    }

    public E peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println("Queue after enQueue operations: 1, 2, 3");

        System.out.println("Peek element: " + queue.peek()); 

        System.out.println("DeQueue element: " + queue.deQueue()); 
        System.out.println("DeQueue element: " + queue.deQueue()); 

        System.out.println("Is the queue empty? " + queue.isEmpty()); 

        System.out.println("Peek element: " + queue.peek()); 
        System.out.println("DeQueue element: " + queue.deQueue()); 

        System.out.println("Is the queue empty? " + queue.isEmpty()); 
    }
}
