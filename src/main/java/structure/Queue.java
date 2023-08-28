package structure;

public interface Queue<T> {

    void add(T element);
    T remove();

    boolean isEmpty();
}
