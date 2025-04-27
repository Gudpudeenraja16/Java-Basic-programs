import java.util.ArrayList;

public class Program21<T> {
    private ArrayList<T> stack;
    private int top;
    
    public Program21() {
        stack = new ArrayList<>();
        top = -1;
    }
    
    public void push(T item) {
        stack.add(item);
        top++;
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        T item = stack.get(top);
        stack.remove(top);
        top--;
        return item;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return stack.get(top);
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public int size() {
        return top + 1;
    }
    
    public void clear() {
        stack.clear();
        top = -1;
    }

    public void printStack() {
        System.out.println("Stack elements: " + stack);
    }

    public static void main(String[] args) {
        Program21<Integer> stack = new Program21<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek());  
        
        System.out.println("Stack size: " + stack.size());  
        
        stack.printStack(); 
        
        System.out.println("Popped element: " + stack.pop());  
        
        stack.printStack();  
        
        System.out.println("Stack is empty: " + stack.isEmpty());  
        
        stack.clear();
        
        System.out.println("Stack cleared.");
        
        stack.printStack();  
    }
}

