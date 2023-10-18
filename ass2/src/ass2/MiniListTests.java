package ass2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MiniListTests {
    @Test
    public void testAddFirst() {
        MiniList<Integer> list = new MiniList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.getFirst().intValue());
    }

    @Test
    public void testAddLast() {
        MiniList<Integer> list = new MiniList<Integer>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.getFirst().intValue());
        assertEquals(2, list.removeLast().intValue());
    }

    @Test
    public void testRemoveFirst() {
        MiniList<Integer> list = new MiniList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.removeFirst().intValue());
        assertEquals(1, list.removeFirst().intValue());
    }

    @Test
    public void testRemoveLast() {
        MiniList<Integer> list = new MiniList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(1, list.removeLast().intValue());
        assertEquals(2, list.removeLast().intValue());
    }
    
    @Test
    public void testIsEmpty() {
        MiniList<Integer> list = new MiniList<Integer>();
        assertTrue(list.isEmpty());
        list.addFirst(1);
        assertFalse(list.isEmpty());
        list.removeFirst();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testToString() {
        MiniList<Integer> list = new MiniList<Integer>();
        assertEquals("", list.toString());
        list.addFirst(1);
        assertEquals("0: 1\n", list.toString());
        list.addFirst(2);
        assertEquals("0: 2\n1: 1\n", list.toString());
        list.addLast(3);
        assertEquals("0: 2\n1: 1\n2: 3\n", list.toString());
        list.removeFirst();
        assertEquals("0: 1\n1: 3\n", list.toString());
        list.removeLast();
        assertEquals("0: 1\n", list.toString());
        list.removeFirst();
        assertEquals("", list.toString());
    }
}
