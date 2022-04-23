import java.util.*;

public class MyQueue <T> {
    private LinkedList<T> arr;

    public MyQueue() {
        arr = new LinkedList<>();
    }

    public int size(){
        return arr.size();
    }
    public void enqueue(T item) {
        arr.push(item);
    }

    public T peek() {
        return arr.getLast();
    }

    public T dequeue() {
        return arr.removeFirst();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index){
        return arr.get(index);
    }

}