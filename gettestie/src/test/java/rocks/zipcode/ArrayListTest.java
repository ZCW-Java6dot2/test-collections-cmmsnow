package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;

public class ArrayListTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayListSet(){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");

        String expectedBrand = "Sally";
        people.set(0,"Sally");
        String actualBrand = people.get(0);

        Assert.assertEquals(expectedBrand,actualBrand) ;
    }

    @org.junit.Test
    public void TestArrayListAdd1(){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");

        Integer expectedLength = people.size()+1;
        people.add("Sally");
        Integer actualLength = people.size();

        Assert.assertEquals(expectedLength,actualLength);
    }

    @org.junit.Test
    public void TestArrayListAdd2(){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");

        String expectedName = "Sally";
        people.add(expectedName);
        String actualName = people.get(people.size()-1);

        Assert.assertEquals(expectedName, actualName);
    }

    @org.junit.Test
    public void TestArrayListRemove1(){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");

        String expectedName = "Mary";
        people.remove("Ana");
        String actualName = people.get(people.size()-1);

        Assert.assertEquals(expectedName, actualName);
    }

    @org.junit.Test
    public void TestArrayListRemove2(){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");

        Integer expectedSize = people.size()-1;
        people.remove("Ana");
        Integer actualSize = people.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @org.junit.Test
    public void TestArrayListGet(){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");

        String expectedName = "Mary";
        String actualName = people.get(1);

        Assert.assertEquals(expectedName, actualName);
    }
}
