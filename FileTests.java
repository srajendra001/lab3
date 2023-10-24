import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test
    public void testGetFiles() throws IOException {
        List<File> expectedResult = new ArrayList<>();
        expectedResult.add(new File("some-files/a.txt"));
        expectedResult.add(new File("some-files/even-more-files/a.txt"));
        expectedResult.add(new File("some-files/even-more-files/d.java"));
        
        expectedResult.add(new File("some-files/more-files/b.txt"));
        expectedResult.add(new File("some-files/more-files/c.java"));
        assertEquals(expectedResult, FileExample.getFiles(new File("some-files")));
    }

    @Test
    public void testGetFiles2() throws IOException {
        List<File> expectedResult2 = new ArrayList<>();
        expectedResult2.add(new File("some-files/more-files/b.txt"));
        expectedResult2.add(new File("some-files/more-files/c.java"));
        assertEquals(expectedResult2, FileExample.getFiles(new File("some-files/more-files")));
    }

    @Test
    public void testGetFiles3() throws IOException {
        List<File> expectedResult3 = new ArrayList<>();
        expectedResult3.add(new File("some-files/a.txt"));
        assertEquals(expectedResult3, FileExample.getFiles(new File("some-files/a.txt")));
    }
}