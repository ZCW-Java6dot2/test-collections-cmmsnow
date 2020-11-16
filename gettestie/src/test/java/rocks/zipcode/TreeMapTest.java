package rocks.zipcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMapPut(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(1, "Mary");
        people.put(12, "Ana");
        //when
        String expectedName = "Bill";
        people.put(56, "Bill");
        //actual
        String actualName = people.get(56);
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestTreeMapGet(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(1, "Mary");
        people.put(12, "Ana");
        people.put(56, "Bill");

        //when
        String expectedName = "Mary";
        //actual
        String actualName = people.get(1);
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestTreeMapContainsKey(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(1, "Mary");
        people.put(12, "Ana");
        people.put(56, "Bill");

        //when
        Boolean expected = true;
        //actual
        Boolean actual = people.containsKey(12);
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeMapContainsValue(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(1, "Mary");
        people.put(12, "Ana");
        people.put(56, "Bill");

        //when
        Boolean expected = true;
        //actual
        Boolean actual = people.containsValue("Mary");
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeMapFirstKey(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(12, "Mary");
        people.put(1, "Ana");
        people.put(56, "Bill");

        //when
        Integer expected = 1;
        //actual
        Integer actual = people.firstKey();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeMapRemove(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(12, "Mary");
        people.put(1, "Ana");
        people.put(56, "Bill");

        //when
        Integer expected = 2;
        people.remove(56);
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeMapReplace(){
        //given
        TreeMap<Integer, String> people = new TreeMap<Integer, String>();
        people.put(12, "Mary");
        people.put(1, "Ana");
        people.put(56, "Bill");

        //when
        String expected = "Sara";
        people.replace(1, expected);
        //actual
        String actual = people.get(1);
        //then
        Assert.assertEquals(expected,actual);
    }
}
