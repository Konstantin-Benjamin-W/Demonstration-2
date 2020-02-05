import java.util.*;

public class ArrayImpl implements Array {

    private Object[] array = new Object[4];
    private int index = 0;

    private class IteratorImpl implements Iterator {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Object next() {
            if (cursor > array.length) {
                throw new NoSuchElementException();
            }
            return array[cursor++];
        }
    }


    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        index = 0;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    @Override
    public void add(Object element) {
        array[index++] = element;
    }

    @Override
    public void set(int index, Object element) {
        array[index] = element;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < array.length; i++) {
            if (obj.equals(array[i]))
                return i;
        }
        return -1;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(", ");
            sb.append((String) array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < array.length; i++) {
            array[i] = array[i + 1];
        }
    }
    //сделать, чтобы удалял конкретный элемент; не понял? - вызови ремув в мейне

    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl();
        System.out.println(array.size());
        array.add("F");
        array.add("A");
        array.add("Q");
        array.add("G");
        System.out.println(array.size());
        array.set(2, "Z");
        System.out.println(array.get(1));
        System.out.println(array.indexOf("A"));
        System.out.println(array.toString());
    }
}