class Collection {
    protected int[] arr;
    protected int size;
    protected int count;

    public Collection(int size) {
        this.size = size;
        this.arr = new int[size];
        this.count = 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
class Stack extends Collection {

    public Stack(int size) {
        super(size);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            arr[count++] = value;
            System.out.println(value + " pushed onto the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = arr[--count];
            System.out.println(value + " popped from the stack.");
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return arr[count - 1];
        }
    }
    
    public void Display()
    {
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
class Queue extends Collection {
    private int front;
    private int rear;

    public Queue(int size) {
        super(size);
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % size;
            arr[rear] = value;
            count++;
            System.out.println(value + " enqueued to the queue.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int value = arr[front];
            front = (front + 1) % size;
            count--;
            System.out.println(value + " dequeued from the queue.");
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        } else {
            return arr[front];
        }
    }
    public void Display()
    {
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
public class Program22 {
    public static void main(String[] args) {
        System.out.println("-----------Stack Operations-------------");
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.Display();
        System.out.println("The Size of Stack Elements: "+stack.size);
        System.out.println("Top element in stack: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop in stack: " + stack.peek());

        System.out.println("-----------Queue Operations-------------");
        Queue queue = new Queue(3);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.Display();
        System.out.println("The Size of Queue Elements: "+queue.size);
        System.out.println("Front element in queue: " + queue.peek());
        queue.dequeue();
        System.out.println("Front element after dequeue in queue: " + queue.peek());
    }
}
