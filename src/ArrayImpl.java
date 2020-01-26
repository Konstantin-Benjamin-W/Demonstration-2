package ua.nure.bohuslavskyi.Practice2;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ArrayImpl implements Array {

    public class IteratorImpl implements Iterator<Object> {

        Object[] array1 = new Object[3];

        @Override
        public boolean hasNext() {
            if (array1[index + 1] != 'null') {
                return true;
            } else {
                return false;
            }

            @Override
            public abstract Object next () {
                if (hasNext() != false) {
                    return array1[index + 1];
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < array1.length; i++)
            array1[i] = null;
    }

    @Override
    public int size() {
        return array1.length;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public void add(Object element) {
        public boolean add (E e){
            ensureCapacityInternal(size + 1);
            elementData[size++] = e;
            return true;
        }
    }

    @Override
    public void set(int index, Object element) {
        array1[index] = element;
    }

    @Override
    public Object get(int index) {
        try {
            if (0 <= index <= array1.length) {
                return array1[index];
            }
        } catch (Exception e) {
            System.out.println("Enter right number, please");
        }
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(obj))
                return i;
        }
    }

    @Override
    public void remove(int index) {
        array1[index] = null;
        for (int i = index; i < array1.length; i++) {
            array1[i] = array1[i - 1];
        }
    }

    public static void main(String[] args) {
        hasNext();
        next();
        size();
        add("F");
        set(2, "Z");
        get(3);
        indexOf("A");
        remove(1);
    }
}