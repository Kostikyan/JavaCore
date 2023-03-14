package additionalLessons;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<T> {

    private Queue<T> mainQueue;
    private Queue<T> tempQueue;

    public Stack(){
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }


    public void push(T element) {
        mainQueue.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("additionalLessons.Stack is empty");
            return null;
        }
        while (mainQueue.size() > 1) {
            tempQueue.add(mainQueue.remove());
        }
        T result = mainQueue.peek();

        Queue<T> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return result;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("additionalLessons.Stack is empty");
            return null;
        }

        return mainQueue.peek();
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    public int size() {
        return mainQueue.size();
    }

    @Override
    public String toString() {
        return "mainQueue=" + mainQueue;
    }
}
