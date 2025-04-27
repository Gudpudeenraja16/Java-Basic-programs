import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class Program25 {
    
    private LinkedList list;

    public Program25() {
        list = new LinkedList();
    }

    @SuppressWarnings("unchecked")
    public void push(Object element) {
        list.addFirst(element);
    }

    public Object pop() {
        return list.removeFirst();
    }

    public Object peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
public static void main(String[] args) {
    
Program25 stack = new Program25();
stack.push("Apple");
stack.push("Banana");
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); 
System.out.println(stack.peek()); 
System.out.println(stack.isEmpty()); 
}
}