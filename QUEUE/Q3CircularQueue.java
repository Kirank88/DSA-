package QUEUE;

public class Q3CircularQueue {

    //Circular queue using array
    static int arr[];
    static int size;
    static int rear;
    static int front;

    Q3CircularQueue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    //when rear moves to next element it finds that front is sitting just next to rear
    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    //add
    public static void add(int data) {
        if(rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        //add first element
        if(front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];
        
        //last element to delete
        if(rear == front) {
            rear = front = -1;
        }
        else {
            front = (front + 1) % size;
        }
        return result;
    }

    //peek
    public static int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front]; 
    }

    public static void main(String[] args) {
        Q3CircularQueue q = new Q3CircularQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
