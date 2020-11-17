package rocks.zipcode;

import org.junit.Assert;

import java.util.PriorityQueue;
import java.util.Vector;

public class VectorTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVectorAdd(){
        //given
        Vector<String> people = new Vector<String>();
        people.addElement("Mary");
        people.addElement("Bob");
        people.addElement("Ana");
        //when
        Integer expected = 3;
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestVectorCapacity(){
        //given
        Vector<String> people = new Vector<String>(5);
        people.addElement("Mary");
        people.addElement("Bob");
        people.addElement("Ana");
        //when
        Integer expected = 5;
        //actual
        Integer actual = people.capacity();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestVectorContains(){
        //given
        Vector<String> people = new Vector<String>(5);
        people.addElement("Mary");
        people.addElement("Bob");
        people.addElement("Ana");
        //when
        Boolean expected = true;
        //actual
        Boolean actual = people.contains("Bob");
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestVectorIsEmpty(){
        //given
        Vector<String> people = new Vector<String>(5);
        people.addElement("Mary");
        people.addElement("Bob");
        people.addElement("Ana");
        //when
        Boolean expected = false;
        //actual
        Boolean actual = people.isEmpty();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestVectorRemoveElement(){
        //given
        Vector<String> people = new Vector<String>(5);
        people.addElement("Mary");
        people.addElement("Bob");
        people.addElement("Ana");
        //when
        Integer expected = 2;
        people.remove("Ana");
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestVectorGet(){
        //given
        Vector<String> people = new Vector<String>(5);
        people.addElement("Mary");
        people.addElement("Bob");
        people.addElement("Ana");
        //when
        String expected = "Mary";
        //actual
        String actual = people.get(0);
        //then
        Assert.assertEquals(expected,actual);
    }
}
