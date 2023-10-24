import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class sc implements StringChecker {
    public boolean checkString (String s) {
        return true;
    }
}

public class ListTests {
    @Test
    public void testFilter() { 
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("world");
        assertEquals(list, ListExamples.filter(list, new sc()));
    }

    @Test
    public void testMerge() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("apple");
        list.add("car");
        list2.add("banana");
        list2.add("dog");
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("apple");
        expectedResult.add("banana");
        expectedResult.add("car");
        expectedResult.add("dog");
        assertEquals(expectedResult, ListExamples.merge(list, list2));
    }
}