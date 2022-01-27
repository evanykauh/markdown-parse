import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;


public class MarkdownParseTest {
    @Test
    public void testgetLinksFile1() throws IOException{
        List<String> expected = List.of("https://something.com", "some-page.html");
        Path filename = Path.of("test-file.md");
        String contents = Files.readString(filename);
        ArrayList<String> actual =  MarkdownParse.getLinks(contents);
        assertEquals(expected, actual);
    }
}

//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
//cmd shift P for classpath config 
//set path to folder with junit and hamcrest testers