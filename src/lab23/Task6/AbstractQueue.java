package lab23.Task6;

public abstract class AbstractQueue<T> {
    protected int size;

    public void enqueue(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        enqueueImpl(element);
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T result = dequeueImpl();
        size--;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return peekImpl();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        clearImpl();
        size = 0;
    }

    // Абстрактные методы, которые должны реализовать потомки
    protected abstract void enqueueImpl(T element);

    protected abstract T dequeueImpl();

    protected abstract T peekImpl();

    protected abstract void clearImpl();
}