import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TestBird {

    private Bird b;

    @BeforeEach
    public void setup(){
        b = new Bird();
    }

    @Test
    public void testMove(){
        assertEquals("I am flying!", b.move());
    }

    @Test
    public void testMakeSound(){
        assertEquals("chirp!", b.makeSound());
    }

}
