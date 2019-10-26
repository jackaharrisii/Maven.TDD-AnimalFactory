package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 003);
        CatHouse.add(sadie);
        Assert.assertEquals(sadie, CatHouse.getCatById(003));
    }

    @Test
    public void removeCatTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 004);
        CatHouse.add(sadie);
        CatHouse.remove(sadie);
        Assert.assertEquals(null, CatHouse.getCatById(003));
    }

    @Test
    public void removeCatIdTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 005);
        CatHouse.add(sadie);
        CatHouse.remove(003);
        Assert.assertEquals(null, CatHouse.getCatById(003));
    }

    //don't need to write a test for getCatById, because if it didn't work none of the above tests would work either

    @Test
    public void getNumberOfCatsTest(){
        Cat sadie = new Cat("Sadie, Danger Floof",new Date(2015,03,30) , 006);
        int original = CatHouse.getNumberOfCats();
        CatHouse.add(sadie);
        Assert.assertEquals(Integer.valueOf(original + 1), CatHouse.getNumberOfCats());
    }
}
