package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest(){
        Dog dogmeat = new Dog("Dog", new Date(2014,11,10), 001);
        dogmeat.setName("Dogmeat");
        Assert.assertEquals("Dogmeat",dogmeat.getName());
    }

    @Test
    public void speakTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        Assert.assertEquals("bark!",dogmeat.speak());
    }

    @Test
    public void setBirthDateTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        Date newBD = new Date (2015, 11, 10);
        dogmeat.setBirthDate(newBD);
        Assert.assertEquals(newBD, dogmeat.getBirthDate());
    }

    @Test
    public void eatTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        Food raider = new Food();
        dogmeat.eat(raider);
        Assert.assertEquals(Integer.valueOf(1), dogmeat.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        Assert.assertEquals(Integer.valueOf(001), dogmeat.getId());
    }

    @Test
    public void dogIsAnimalTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        Assert.assertEquals(true, dogmeat instanceof Animal);
    }

    @Test
    public void dogIsMammalTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        Assert.assertEquals(true, dogmeat instanceof Mammal);
    }
}
