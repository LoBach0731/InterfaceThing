import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TestDog {

    private Dog d;

    @BeforeEach
    public void setup(){
        d = new Dog();
    }

    @Test
    public void testMove(){
        assertEquals("I'm running!", d.move());
    }

    @Test
    public void testMakeSound(){
        assertEquals("bark!", d.makeSound());
    }

    @Test
    public void testMisbehave(){
        String string = "shoe";
        assertEquals("I chewed up your " + string + " lol!!!!!!!", d.misbehave(string));
    }
}
