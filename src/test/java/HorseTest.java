import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HorseTest {

    Horse horse;

    @Before
    public void before() {
        horse = new Horse("horse", "Lipizzaner");
    }

    @Test
    public void hasBreed() {
        assertEquals("Lipizzaner", horse.getBreed());
    }

    @Test
    public void canIntroduce() {
        assertEquals("Hi, I am a horse, neigh", horse.introduceYourself());
    }
}
