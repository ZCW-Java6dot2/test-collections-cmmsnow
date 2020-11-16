package rocks.zipcode;

import org.junit.Assert;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedListAdd1(){
        //given
        LinkedList<String> people = new LinkedList<>();
        people.add("Mary");
        people.add("Ana");
        //when
        Boolean expected = true;
        people.add("Bill");
        //actual
        Boolean actual = people.contains("Bill");
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestLinkedListAdd2(){
        //given
        LinkedList<String> people = new LinkedList<>();
        people.add("Mary");
        people.add("Ana");
        //when
        String expected = "Bill";
        people.add(1, expected);
        //actual
        String actual = people.get(1);
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestLinkedListSet(){
        //given
        LinkedList<String> people = new LinkedList<>();
        people.add("Mary");
        people.add("Ana");
        people.add("Sara");
        //when
        String expected = "Bill";
        people.set(1, expected);
        //actual
        String actual = people.get(1);
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestLinkedListSize(){
        //given
        LinkedList<String> people = new LinkedList<>();
        people.add("Mary");
        people.add("Ana");
        //when
        Integer expected = 3;
        people.add("Bob");
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestLinkedListRemove(){
        //given
        LinkedList<String> people = new LinkedList<>();
        people.add("Mary");
        people.add("Ana");
        //when
        Integer expected = 1;
        people.remove("Mary");
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestLinkedListGet(){
        //given
        LinkedList<String> people = new LinkedList<>();
        people.add("Mary");
        people.add("Ana");
        people.add("Bob");
        //when
        String expected = "Ana";
        //actual
        String actual = people.get(1);
        //then
        Assert.assertEquals(expected,actual);
    }
}
