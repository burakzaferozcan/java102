import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int size = 0;
    private int capacity;

    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            this.array = Arrays.copyOf(this.array, this.capacity);
        }
        this.array[this.size++] = data;
    }

    public T get(int index) {
        if (index >= 0 && index < this.size) {
            return this.array[index];
        }
        return null;
    }

    public T remove(int index) {
        if (index >= 0 && index < this.size) {
            T removedData = this.array[index];
            for (int i = index; i < this.size - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[--this.size] = null;
            return removedData;
        }
        return null;
    }

    public T set(int index, T data) {
        if (index >= 0 && index < this.size) {
            T oldData = this.array[index];
            this.array[index] = data;
            return oldData;
        }
        return null;
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(this.array[i]);
            if (i < this.size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public T[] toArray() {
        return Arrays.copyOf(this.array, this.size);
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.array[i] = null;
        }
        this.size = 0;
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList<T> subList(int start, int finish) {
        if (start >= 0 && finish < this.size && start <= finish) {
            MyList<T> sublist = new MyList<>(finish - start + 1);
            for (int i = start; i <= finish; i++) {
                sublist.add(this.array[i]);
            }
            return sublist;
        }
        return null;
    }

    public boolean contains(T data) {
        return this.indexOf(data) != -1;
    }


}
