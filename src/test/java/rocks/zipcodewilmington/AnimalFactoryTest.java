package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        Dog dogmeat = AnimalFactory.createDog("dogmeat", new Date (2015, 11, 10));
        Assert.assertEquals("dogmeat", dogmeat.getName());
        Assert.assertEquals(new Date(2015,11,10), dogmeat.getBirthDate());
    }

    @Test
    public void createCatTest(){
        Cat sadie = AnimalFactory.createCat("Sadie, Danger Floof", new Date (2014, 03, 30));
        Assert.assertEquals("Sadie, Danger Floof", sadie.getName());
        Assert.assertEquals(new Date(2014,03,30), sadie.getBirthDate());
    }
}
