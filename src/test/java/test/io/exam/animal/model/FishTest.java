package test.io.exam.animal.model;

import io.exam.animal.model.SwimmingAnimal;
import io.exam.animal.model.impl.ClownFish;
import io.exam.animal.model.impl.Dolphin;
import io.exam.animal.model.impl.Shark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FishTest {

    @Test
    void testSharkAttributes() {

        Shark shark = new Shark();

        assertEquals("Grey", shark.getColor());
        assertEquals("Large", shark.getSize());

        assertTrue(shark instanceof SwimmingAnimal);
        assertEquals("I am a swimming fish", shark.swim());
        assertEquals("I am eating fish", shark.eatFish());
    }

    @Test
    void testClownFishAttributes() {

        ClownFish clownFish = new ClownFish();

        assertEquals("Orange", clownFish.getColor());
        assertEquals("Small", clownFish.getSize());

        assertTrue(clownFish instanceof SwimmingAnimal);
        assertEquals("I am a swimming fish", clownFish.swim());
        assertEquals("I am telling a joking", clownFish.joke());
    }

    @Test
    void testDolphinCanSwimButNotReallyFish() {

        Dolphin dolphin = new Dolphin();

        assertTrue(dolphin instanceof SwimmingAnimal);
        assertEquals("I am swimming", dolphin.swim());
    }
}
