package test.io.exam.animal.model;

import io.exam.animal.model.*;
import io.exam.animal.model.impl.Butterfly;
import io.exam.animal.model.impl.Caterpillar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestInsect {

    @Test
    void testButterflyCanFly() {

        Butterfly butterfly = new Butterfly();
        assertTrue(butterfly instanceof FlyingInsect);
        assertTrue(butterfly instanceof FlyingAnimal);

        assertEquals("I am flying", butterfly.fly());
    }

    @Test
    void testButterflyCanAlsoCrawl() {

        Butterfly butterfly = new Butterfly();
        assertTrue(butterfly instanceof Insect);
        assertTrue(butterfly instanceof WalkingAnimal);

        assertEquals("I am crawling", butterfly.walk());
    }

    @Test
    void testCaterpillarCanNotFly() {

        Caterpillar caterpillar = new Caterpillar();
        assertTrue(caterpillar instanceof Insect);
        assertTrue(caterpillar instanceof WalkingAnimal);
        assertFalse(caterpillar instanceof FlyingInsect);
        assertFalse(caterpillar instanceof FlyingAnimal);

        assertEquals("I am crawling", caterpillar.walk());
    }
}
