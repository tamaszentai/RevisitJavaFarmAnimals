import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheepTest {

    Sheep sheep;

    @Before
    public void before() {
        sheep = new Sheep("sheep");
    }

    @Test
    public void hasSpecies() {
        assertEquals("sheep", sheep.getSpecies());
    }

    @Test
    public void canIntroduce() {
        assertEquals("Hi, I am a sheep, baaa baaa", sheep.introduceYourself());
    }
}
