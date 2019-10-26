package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 001);
        DogHouse.add(dogmeat);
        Assert.assertEquals(dogmeat, DogHouse.getDogById(001));
    }

    @Test
    public void removeDogTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 002);
        DogHouse.add(dogmeat);
        DogHouse.remove(dogmeat);
        Assert.assertEquals(null, DogHouse.getDogById(001));
    }

    @Test
    public void removeDogIdTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 003);
        DogHouse.add(dogmeat);
        DogHouse.remove(001);
        Assert.assertEquals(null, DogHouse.getDogById(001));
    }

    //don't need to write a test for getCatById, because if it didn't work none of the above tests would work either
    //overruled by Chris - we have to get practice writing redundant pointless tests because future managers may require us to write redundant pointless tests....    :)

    @Test
    public void getDogByIdTest(){
        Dog dogmeat5 = new Dog("Dogmeat", new Date(2014,11,10), 005);
        DogHouse.add(dogmeat5);
        Assert.assertEquals(dogmeat5, DogHouse.getDogById(005));
    }

    @Test
    public void getNumberOfDogsTest(){
        Dog dogmeat = new Dog("Dogmeat", new Date(2014,11,10), 004);
        int original = DogHouse.getNumberOfDogs();
        DogHouse.add(dogmeat);
        Assert.assertEquals(Integer.valueOf(original + 1), DogHouse.getNumberOfDogs());
    }
}
