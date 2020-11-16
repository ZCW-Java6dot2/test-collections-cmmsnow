package rocks.zipcode;

import org.junit.Assert;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeSetAdd(){
        //given
        TreeSet<String> people = new TreeSet<String>();
        people.add("Mary");
        people.add("Ana");
        //when
        Integer expected = 3;
        people.add("Bill");
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeSetContains(){
        //given
        TreeSet<String> people = new TreeSet<String>();
        people.add("Mary");
        people.add("Ana");
        //when
        Boolean expected = false;
        //actual
        Boolean actual = people.contains("Bill");
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeSetRemove(){
        //given
        TreeSet<String> people = new TreeSet<String>();
        people.add("Mary");
        people.add("Ana");
        people.add("Bill");
        //when
        Integer expected = 2;
        people.remove("Ana");
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestTreeSetIsEmpty(){
        //given
        TreeSet<String> people = new TreeSet<String>();
        people.add("Mary");
        people.add("Ana");
        //when
        Boolean expected = false;
        //actual
        Boolean actual = people.isEmpty();
        //then
        Assert.assertEquals(expected,actual);
    }
}
