import java.util.*;

public class MyStack <T> {
    private LinkedList<T> arr;

    public MyStack() {
        arr = new LinkedList<>();
    }

    public int size(){
        return arr.size();
    }
    public void push(T item) {
        arr.add(0, item);
    }

    public T peek() {
        return arr.getLast();
    }

    public T pop() {
        return arr.removeLast();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index){
        return arr.get(index);
    }

}