import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMainOutput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        Main.main(new String[]{});

        // Assert
        assertEquals("Hello World!", outContent.toString().trim());
    }
}