package ass2;

import java.util.NoSuchElementException;

public class MyStack<T> implements StackInterface<T> {
    private MiniList<T> list = new MiniList<T>();

    @Override
    public void push(T item) {
        list.addFirst(item);
    }

    @Override
    public T pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return list.removeFirst();
    }

    @Override
    public T peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
