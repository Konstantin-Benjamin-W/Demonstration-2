//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//
//import java.util.Scanner;
//
//public class QueueImpl implements Queue{
//    private static Object element = "Johny";
//    private Object[] queue = new Object[4];
//
//    //В классе QueueImpl создать метод main, в котором продемонстрировать работу:
//    QueueImpl queueImpl = new QueueImpl();
//    queue.enqueue(element);
//    queue.dequeue();
//    queue.top();
//
//    public static void main(String[] args) {
//        ArrayImpl arrayImpl = new ArrayImpl();
//
//        System.out.println(arrayImpl.size());
//        arrayImpl.add("A");
//        arrayImpl.add("B");
//        arrayImpl.add("C");
//        arrayImpl.add(null);
//        arrayImpl.add(null);
//        arrayImpl.add("D");
//        System.out.println(arrayImpl);
//        System.out.println(arrayImpl.contains("B"));
//        arrayImpl.remove(2);
//        System.out.println(arrayImpl);
//    }
//
//    int counter = 0;
//    Scanner scanner = new Scanner(System.in);
//    String amountOfObjects = scanner.next();
//    counter++;
//    int[] queue = new int[counter];
//
//    //below is realization of methods of Queue
//    @Override
//    public Object[] enqueue() {
//        Object[] queue2 = new Object[queue.length + 1];
//        queue2[queue.length] = element;
//        return queue2;
//    }
//
//    @Override
//    public Object[] dequeue() {
//        Object[] queue2 = new Object[queue.length - 1];
//        for (int i = 0; i < queue.length; i++){
//            queue2[i] = queue[i++];
//        }
//        return queue2;
//    }
//
//    @Override
//    public Object top() {
//        return queue[queue.length - 1];
//    }
//
//    //below is realization of methods of Container
//    @Override
//    public void clear() {
//        for (int i = 0; i < queue.length; i++) {
//            queue[i] = 0;
//        }
//    }
//
//    @Override
//    public int size() {
//        return queue.length;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        sb.append(queue[0]);
//        for (int i = 1; i < queue.length; i++) {
//            sb.append(", ");
//            sb.append((String)queue[i]);
//        }
//        sb.append("]");
//        return sb.toString();
//    }
//}
//    //1) всех методов интерфейса Queue (включая унаследованные от Container и Iterable);
//    //2) всех методов интерфейса Iterator (hasNext/next/remove).
//}