package test.io.exam.animal.model;

import io.exam.animal.model.FlyingAnimal;
import io.exam.animal.model.WalkingAnimal;
import io.exam.animal.model.impl.Butterfly;
import io.exam.animal.model.impl.Caterpillar;
import io.exam.animal.model.impl.CrawlingInsect;
import io.exam.animal.model.impl.FlyingInsect;
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
        assertTrue(butterfly instanceof CrawlingInsect);
        assertTrue(butterfly instanceof WalkingAnimal);

        assertEquals("I am crawling", butterfly.walk());
    }

    @Test
    void testCaterpillarCanNotFly() {

        Caterpillar caterpillar = new Caterpillar();
        assertTrue(caterpillar instanceof CrawlingInsect);
        assertTrue(caterpillar instanceof WalkingAnimal);
        assertFalse(caterpillar instanceof FlyingInsect);
        assertFalse(caterpillar instanceof FlyingAnimal);

        assertEquals("I am crawling", caterpillar.walk());
    }
}
