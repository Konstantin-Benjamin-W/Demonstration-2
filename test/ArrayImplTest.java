import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ArrayImplTest {

    private ArrayImpl array;

    @Before
    public void createArrayImpl() {
        array = new ArrayImpl();
    }

    @Test
    public void shouldAddThreeElementToArrayAndPrint() {
        array.add("A");
        array.add("B");
        array.add("C");

        assertEquals(3, array.size());
        assertEquals("[A, B, C]", array.toString());
    }

    @Test
    public void shouldAddFourElementToArrayAndPrint() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");

        assertEquals(4, array.size());
        assertEquals("[A, B, C, D]", array.toString());
    }

    @Test
    public void shouldAddFiveElementToArray() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        assertEquals(5, array.size());
    }

    @Test
    public void shouldAddFiveElementAndRemoveAtNullIndex() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        assertEquals(5, array.size());
        array.remove(0);
        assertEquals(array.get(0), "B");
    }

    @Test
    public void shouldPrintAllCollectionWithIterator() {
        array.add("A");
        array.add("B");
        array.add("C");
        Iterator iterator = array.iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next() + ", ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);

        assertEquals("A, B, C", sb.toString());
    }

    @Test
    public void shouldReturnTrueIfArrayImplContainsElement() {
        array.add("A");
        array.add("B");
        array.add("C");

        assertTrue(array.contains("A"));
        assertTrue(array.contains("B"));
        assertTrue(array.contains("C"));
        assertFalse(array.contains('A'));
        assertFalse(array.contains("E"));
    }

    @Test
    public void shouldReturnTrueIfArrayImplContainsElement2() {
        String a = new String("a");
        String b = new String("b");
        String c = new String("c");
        array.add(a);
        array.add(b);
        array.add(c);
        String a1 = new String("a");
        assertTrue(array.contains("a"));
        assertTrue(array.contains(a1));
        assertTrue(array.contains(new String("b")));
    }

    @Test
    public void shouldReturnTrueIfArrayImplContainsElement3() {
        StringBuilder one = new StringBuilder("1");
        StringBuilder two = new StringBuilder("2");
        StringBuilder three = new StringBuilder("3");

        array.add(one);
        array.add(two);
        array.add(three);

        StringBuilder one1 = new StringBuilder("1");

        assertTrue(array.contains(one1));
        assertTrue(array.contains(new StringBuilder("1")));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenTryDeleteElementOutOfBound() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        //пытаемся удалить элемент за пределами массива - должно быть исключение
        array.remove(7);
    }

    @Test
    public void shouldRemoveFromTheMiddle() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        assertEquals("[A, B, C, D, E]", array.toString());
        assertEquals(5, array.size());
        array.remove(2);
        assertEquals(4, array.size());
        assertEquals("[A, B, D, E]", array.toString());
        array.add("C");
        assertEquals(5, array.size());
        assertEquals("[A, B, D, E, C]", array.toString());
    }

    @Test
    public void shouldRemoveOneByOne() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        for (int i = 0; i < 5; i++) {
            array.remove(0);
        }
        assertEquals(0, array.size());
        assertEquals("[]", array.toString());
    }

    @Test
    public void shouldSetElementCorrectly() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.set(0, "ONE");
        array.set(2, "TWO");
        array.set(4, "END");
        assertEquals(5, array.size());
        assertEquals("[ONE, B, TWO, D, END]", array.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenTrySetElementOutOfBound() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.set(0, "ONE");
        array.set(2, "TWO");
        array.set(6, "END");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenTryGetElementOutOfBound() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.set(6, "F");
        array.get(6);
    }

    @Test
    public void shouldReturnMinusOneIfElementIsAbsent() {
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");

        assertEquals(4, array.indexOf("E"));
        assertEquals(-1, array.indexOf("F"));
    }


    @Test(expected = NoSuchElementException.class)
    public void iteratorShouldThrowNoSuchElementException() {
        array.add("A");
        array.add("B");
        array.add("C");
        Iterator iterator = array.iterator();
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());
        iterator.next();
    }

    @Test
    public void shouldRemoveAllElementsWithIterator(){
        array.add("A");
        array.add("B");
        array.add("C");

        Iterator iterator = array.iterator();
        String temp;
        int count = 0;
        //итератор берез элемент начиная с 0, записывает его в temp
        //сравниваем нулевой элемент и temp
        while (iterator.hasNext()){
            temp = (String) iterator.next();
            assertEquals(array.get(count), temp);
            iterator.remove();
        }
        assertEquals(0, array.size());
        assertEquals("[]", array.toString());
    }

    @Test
    public void shouldRemoveLastReturnedElementWithIterator(){
        array.add("A");
        array.add("B");
        array.add("C");

        Iterator iterator = array.iterator();

        Object temp = iterator.next();
        assertEquals("A", temp);
        iterator.remove();
        assertEquals("[B, C]", array.toString());

        temp = iterator.next();
        assertEquals("B", temp);
        iterator.remove();
        assertEquals("[C]", array.toString());

        temp = iterator.next();
        assertEquals("C", temp);
        iterator.remove();
        assertEquals("[]", array.toString());
    }
}