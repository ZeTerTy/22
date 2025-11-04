import java.util.LinkedList;

public class Cache<T> {
    private final LinkedList<T> items;
    private final int maxSize;
    
    public Cache(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Размер кэша должен быть больше 0");
        }
        this.maxSize = maxSize;
        this.items = new LinkedList<>();
    }
    
    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть null");
        }
        
        if (items.contains(item)) {
            items.remove(item);
        }
        
        items.addLast(item);
        
        if (items.size() > maxSize) {
            items.removeFirst();
        }
    }
    
    public boolean remove(T item) {
        return items.remove(item);
    }
    
    public boolean exists(T item) {
        return items.contains(item);
    }
    
    public T getFirst() {
        return items.isEmpty() ? null : items.getFirst();
    }
    
    public T getLast() {
        return items.isEmpty() ? null : items.getLast();
    }
    
    public T getItemByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }
        return items.get(index);
    }
    
    public int size() {
        return items.size();
    }
    
    @Override
    public String toString() {
        return items.toString();
    }
}
