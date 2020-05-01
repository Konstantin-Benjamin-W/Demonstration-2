//Исключение, указывающее на переполнение очереди
public class QueueFullException extends Exception {
    int size;
    QueueFullException(int s) {
        size = s;
    }
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}

//Исключение, указывающее на исчерпание очереди
class QueueEmptyException extends Exception{
    public String toString() {
        return "\nОчередь пуста";
    }
}