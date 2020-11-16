package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMapPut(){
        //given
        HashMap<Integer, String> ages = new HashMap<Integer, String>();
        ages.put(1, "Mary");
        ages.put(12, "Ana");
        //when
        String expectedName = "Bill";
        ages.put(56, "Bill");
        //actual
        String actualName = ages.get(56);
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestHashMapGet(){
        //given
        HashMap<Integer, String> ages = new HashMap<Integer, String>();
        ages.put(1, "Mary");
        ages.put(12, "Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = ages.get(12);
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestHashMapIsEmpty(){
        //given
        HashMap<Integer, String> ages = new HashMap<Integer, String>();
        ages.put(1, "Mary");
        //when
        Boolean expected = false;
        //actual
        Boolean actual = ages.isEmpty();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestHashMapSize(){
        //given
        HashMap<Integer, String> ages = new HashMap<Integer, String>();
        ages.put(1, "Mary");
        ages.put(12, "Ana");
        //when
        Integer expected = 2;
        //actual
        Integer actual = ages.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestHashMapRemove(){
        //given
        HashMap<Integer, String> ages = new HashMap<Integer, String>();
        ages.put(1, "Mary");
        ages.put(12, "Ana");
        ages.put(46, "Sara");
        //when
        ages.remove(1);
        Integer expected = 2;
        //actual
        Integer actual = ages.size();
        //then
        Assert.assertEquals(expected,actual);
    }
}
