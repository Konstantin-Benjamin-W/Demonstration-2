import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayImplTest {

    private  ArrayImpl array;

    @Before
    public void createArrayImpl(){
        array = new ArrayImpl();
    }

    @Test
    public void shouldAddThreeElementToArrayAndPrint(){
        array.add("A");
        array.add("B");
        array.add("C");

        assertEquals(3, array.size());

        assertEquals("[A, B, C]", array.toString());
    }

    @Test
    public void shouldAddFourElementToArrayAndPrint(){
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        assertEquals(4, array.size());

        assertEquals("[A, B, C, D]", array.toString());
    }

    @Test
    public void shouldAddFiveElementToArray(){
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        assertEquals(5, array.size());
    }

    @Test
    public void shouldAddFiveElementAndRemoveAtNullIndex(){
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println(array);
        assertEquals(5, array.size());
        array.remove(0);
        assertEquals(array.get(0), "B");
    }

    @Test
    public void shouldPrintAllCollectionWithIterator(){
        array.add("A");
        array.add("B");
        array.add("C");
        Iterator iterator = array.iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()){
            sb.append(iterator.next() + ", ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);

        assertEquals("A, B, C", sb.toString());
    }

    @Test
    public void shouldReturnTrueIfArrayImplContainsElement(){
        array.add("A");
        array.add("B");
        array.add("C");

        assertTrue(array.contains("A"));
    }
}