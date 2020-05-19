//public class IQDemo {
//    public static void main(String[] args) {
//        queues.FixedQueue q1 = new queues.FixedQueue(10);
//        queues.DynQueue q2 = new queues.DynQueue(5);
//        queues.CircularQueue q3 = new queues.CircularQueue(10);
//
//        queues.ICharQ iQ;
//        char ch;
//        int i;
//
//        iQ = q1;
//        //Поместить ряд символов в очередь фиксированного размера
//        for (i = 0; i < 10; i++)
//            iQ.put((char) ('A' + i));
//
//        //Отобразить содержимое фиксированной очереди
//        System.out.print("Содержимое фиксированной очереди: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        iQ = q2;
//        //Поместить ряд символов в динамическую очередь
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('Z' - i));
//        }
//
//        //Отобразить содержимое динамической очереди
//        System.out.print("Cодержимое динамической очереди: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        iQ = q3;
//        //Поместить ряд символов в кольцевую очередь
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('A' + i));
//        }
//
//        //Отобразить содержимое кольцевой очереди
//        System.out.print("Содержимое кольцевой очереди: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        //Поместить больше символов в кольцевую очередь
//        for (i = 10; i < 20; i++)
//            iQ.put((char) ('A' + i));
//
//        //Отобразить содержимое кольцевой очереди
//        System.out.print("\nСодержимое кольцевой очереди: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println("\nСохранение и использование данных кольцевой очереди");
//
//        //Поместить символы в кольцевую очередь и извлечь их оттуда
//        for (i = 0; i < 20; i++) {
//            iQ.put((char) ('A' + i));
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//    }
//}