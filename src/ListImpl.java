//import org.jcp.xml.dsig.internal.SignerOutputStream;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class ListImpl implements List {
//
//    ArrayList<Object> array = new ArrayList<>();
//    Object element;
//    array.add(3);
//    array.add(7);
//    array.add('A');
//    array.add(0.22);
//    array.add(0.5);
//
//    public static void main(String[] args) {
//        System.out.println(array.size());
//        System.out.println(array.toString());
//        array.addFirst('Z');
//        array.removeFirst();
//        array.addLast(18);
//        array.removeLast();
//        System.out.println(array.getFirst());
//        System.out.println(array.getLast());
//        System.out.println(array.search('A'));
//        System.out.println(array.remove(7));
//        array.clear();
//        System.out.println(array.size());
//    }
//
//    private static class Node{
//
//    }
//    private class IteratorImpl implements Iterator {
//        private int cursor = 0;
//
//        @Override
//        public boolean hasNext() {
//            return cursor < array.length;
//        }
//
//        @Override
//        public Object next() {
//            if (cursor > array.length) {
//                throw new NoSuchElementException();
//            }
//            return array[cursor++];
//        }
//    }
//    @Override
//    public Iterator<Object> iterator() {
//        return new IteratorImpl();
//    }
//
//    //below is realization of methods of Container
//    @Override
//    public void clear(){
//        int index = array.length;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 0;
//        }
//        index = 0;
//    }
//
//    @Override
//    public int size() {
//        return array.length;
//    }
//
//    @Override
//    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        sb.append(array[0]);
//        for (int i = 1; i < array.length; i++) {
//            sb.append(", ");
//            sb.append(array[i]);
//        }
//        sb.append("]");
//        return sb.toString();
//    }
//
//    //there is realization of methods of List below
//    @Override
//    public void addFirst(Object element){
//        array[0] = element;
//        for (int i = 0; i < array.length; i++) {
//            array[i++] = array[i];
//        }
//    }
//
//    @Override
//    public Object[] addLast(Object element) {
//        int a = array.length;
//        Object[] list2 = new Object[a++];
//        list2[a++] = (int) element;
//        return list2;
//    }
//
//    @Override
//    public void removeFirst() {
//        array[0] = 0;
//        for (int i = 1; i < array.length; i++) {
//            array[i--] = array[i];
//        }
//    }
//
//    @Override
//    public void removeLast() {
//        array[array.length - 1] = 0;
//    }
//
//    @Override
//    public Object getFirst() {
//        return array[0];
//    }
//
//    @Override
//    public Object getLast() {
//        return array[array.length - 1];
//    }
//
//    @Override
//    public Object search(Object element) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(element)) {
//                return element;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public boolean remove(Object element) {
//        for (int i= 0; i < array.length; i++) {
//            if (array[i] == element) {
//                array[i] = 0;
//                array[i] = array[i++];
//                return true;
//            }
//        }
//    return false;
//    }
//}