public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(10);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;

        iQ = q1;
        //Поместить ряд символов в очередь фиксированного размера
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        //Отобразить содержимое фиксированной очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q2;
        //Поместить ряд символов в динамическую очередь
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        //Отобразить содержимое динамической очереди
        System.out.print("Cодержимое динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;
        //Поместить ряд символов в кольцевую очередь
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        //Отобразить содержимое кольцевой очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди");

        //Поместить символы в кольцевую очередь и извлечь их оттуда
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}

//Класс, реализующий  очередь фиксированного размера для хранения символов
class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    //Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    //Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    //Извлечь символ из очереди
    public char get() {
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}

//Кольцевая очередь
class CircularQueue implements ICharQ{
    private char q[];
    private int getloc, putloc;

    //Создать пустую очередь заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    //Поместить символ в очередь
    public void put(char ch) {
        /*Очередь считается полной, если индекс putloc на единицу меньше индекса getloc
        или если индекс putloc указывает на конец массива, а индекс getloc - на его начало*/
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        if (putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    //Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        if (getloc == q.length) getloc = 0; //Вернуться в начало очереди
        return q[getloc];
    }
}

class DynQueue implements ICharQ{
    private char q[];
    private int getloc, putloc;

    //Создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    //Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            //Увеличить размер очереди
            char t[] = new char[q.length * 2];
            //Скопировать элементы в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
                q = t;
            }

            putloc++;
            q[putloc] = ch;
        }
    }

    //Извлечь символ из очереди
    public char get() {
        if (getloc != putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}