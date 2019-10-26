package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        Date date = new Date();
        Cat sadie = new Cat("Sadie", date, 003);
        sadie.setName("Sadie, Danger Floof");
        Assert.assertEquals("Sadie, Danger Floof",sadie.getName());
    }

    @Test
    public void speakTest(){
        Date date = new Date();
        Cat sadie = new Cat("Sadie, Danger Floof", new Date(2015,03,30), 003);
        Assert.assertEquals("meow!",sadie.speak());
    }

    @Test
    public void setBirthDateTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 003);
        Date newBD = new Date (2014, 03, 30);
        sadie.setBirthDate(newBD);
        Assert.assertEquals(newBD, sadie.getBirthDate());
    }

    @Test
    public void eatTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 003);
        Food cheese = new Food();
        sadie.eat(cheese);
        Assert.assertEquals(Integer.valueOf(1), sadie.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 003);
        Assert.assertEquals(Integer.valueOf(003), sadie.getId());
    }

    @Test
    public void catIsAnimalTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 003);
        Assert.assertEquals(true, sadie instanceof Animal);
    }

    @Test
    public void catIsMammalTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 003);
        Assert.assertEquals(true, sadie instanceof Mammal);
    }
}
