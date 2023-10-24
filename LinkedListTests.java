import static org.junit.Assert.*;
import org.junit.*;
import java.util.NoSuchElementException;

public class LinkedListTests {
    @Test
    public void testLinkedList() {
        LinkedList l = new LinkedList();
        assertEquals(null, l.root);
    }

    @Test
    public void testPrepend() {
        LinkedList l = new LinkedList();
        l.prepend(0);
        assertEquals(0, l.root.value);
        assertEquals(null, l.root.next);
        l.prepend(1);
        assertEquals(1, l.root.value);
        assertEquals(0, l.root.next.value);
        assertEquals(null, l.root.next.next);
    }

    @Test
    public void testAppend() {
        LinkedList l1 = new LinkedList();
        l1.append(5);
        assertEquals(5, l1.root.value);
        assertEquals(null, l1.root.next);

        LinkedList l2 = new LinkedList();
        l2.append(3);
        l2.append(27);
        assertEquals(3, l2.root.value);
        assertEquals(27, l2.root.next.value);
        assertEquals(null, l2.root.next.next);

        LinkedList l3 = new LinkedList();
        l3.append(1);
        l3.append(2);
        l3.append(3);
        assertEquals(1, l3.root.value);
        assertEquals(2, l3.root.next.value);
        assertEquals(3, l3.root.next.next.value);
        assertEquals(null, l3.root.next.next.next);
    }
}