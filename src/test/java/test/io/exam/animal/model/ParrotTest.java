package test.io.exam.animal.model;

import io.exam.animal.model.impl.Parrot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParrotTest {

    private Parrot parrotLivingWithDog;
    private Parrot parrotLivingWithCat;
    private Parrot parrotLivingWithDuck;
    private Parrot parrotLivingWithRooster;
    private Parrot parrotLivingWithPhone;

    @BeforeEach
    public void before() {

        parrotLivingWithCat = new Parrot("Cat", "Meow");
        parrotLivingWithDog = new Parrot("Dog", "Woof, woof");
        parrotLivingWithDuck = new Parrot("Duck", "Quack, quack");
        parrotLivingWithRooster = new Parrot("Rooster", "Cock-a-doodle-doo");
        parrotLivingWithPhone = new Parrot("Phone", "Ring, ring");
    }

    @Test
    void WhenParrotLivesWithCatThenMeow() {

        assertEquals("Cat", parrotLivingWithCat.getLivingWith());
        assertEquals("Meow", parrotLivingWithCat.sing());
        assertNotEquals(parrotLivingWithCat.sing(), parrotLivingWithDog.sing());
    }

    @Test
    void WhenParrotLivesWithDogThenBark() {

        assertEquals("Dog", parrotLivingWithDog.getLivingWith());
        assertEquals("Woof, woof", parrotLivingWithDog.sing());
        assertNotEquals(parrotLivingWithCat.sing(), parrotLivingWithDog.sing());
    }

    @Test
    void WhenParrotLivesWithDuckThenQuack() {

        assertEquals("Duck", parrotLivingWithDuck.getLivingWith());
        assertEquals("Quack, quack", parrotLivingWithDuck.sing());
        assertNotEquals(parrotLivingWithDuck.sing(), parrotLivingWithCat.sing());
    }

    @Test
    void WhenParrotLivesWithRoosterThenCockADoodle() {

        assertEquals("Rooster", parrotLivingWithRooster.getLivingWith());
        assertEquals("Cock-a-doodle-doo", parrotLivingWithRooster.sing());
        assertNotEquals(parrotLivingWithRooster.sing(), parrotLivingWithDuck.sing());
    }

    @Test
    void WhenParrotLivesWithPhoneThenRing() {

        assertEquals("Phone", parrotLivingWithPhone.getLivingWith());
        assertEquals("Ring, ring", parrotLivingWithPhone.sing());
        assertNotEquals(parrotLivingWithRooster.sing(), parrotLivingWithPhone.sing());
    }
}
