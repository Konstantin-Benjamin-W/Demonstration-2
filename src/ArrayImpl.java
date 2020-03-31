import java.util.*;

public class ArrayImpl implements Array {
    private int index = 0;
    private Object[] array = new Object[4];

    public static void main(String[] args) {
        ArrayImpl arrayImpl = new ArrayImpl();

        System.out.println(arrayImpl.size());
        arrayImpl.add("A");
        arrayImpl.add("B");
        arrayImpl.add("C");
        arrayImpl.add(null);
        arrayImpl.add(null);
        arrayImpl.add("D");
        System.out.println(arrayImpl);
        System.out.println(arrayImpl.contains("B"));
        arrayImpl.remove(2);
        System.out.println(arrayImpl);
        System.out.println(arrayImpl.contains("D"));
    }

    private class IteratorImpl implements Iterator {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < index;
        }

        @Override
        public Object next() {
            if (cursor > index - 1) {
                throw new NoSuchElementException();
            }
            return array[cursor++];
        }

        @Override
        public void remove() {
            array[index - 1] = null;
            index--;
        }
    }


    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
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
        Object [] tempArray = new Object [array.length + 1];
        for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
        tempArray[index] = element;
        index++;
        this.array = tempArray;
    }

    @Override
    public void set(int number, Object element) {
        if (number > index - 1) {
            throw new IndexOutOfBoundsException();
        }
        array[number] = element;
            //putting element in the cell number index
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
        for (int i = 0; i < index; i++) {
            if (i == 0) {
                sb.append(array[0]);
            } else {
                if (array.length != 0) {
                    sb.append(", ");
                    sb.append(array[i]);
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void remove(int number) {
        if (number > index) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = number; i < index; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < index; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}