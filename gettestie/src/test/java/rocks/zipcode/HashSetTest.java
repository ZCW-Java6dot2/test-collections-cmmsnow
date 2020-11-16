package rocks.zipcode;

import org.junit.Assert;

import java.util.HashSet;

public class HashSetTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSetAdd(){
        //given
        HashSet<String> people = new HashSet<String>();
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
    public void TestHashSetClear(){
        //given
        HashSet<String> people = new HashSet<String>();
        people.add("Mary");
        people.add("Ana");
        //when
        Integer expected = 0;
        people.clear();
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestHashSetIsEmpty(){
        //given
        HashSet<String> people = new HashSet<String>();
        people.add("Mary");
        //when
        Boolean expected = true;
        people.remove("Mary");
        //actual
        Boolean actual = people.isEmpty();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestHashSetContains(){
        //given
        HashSet<String> people = new HashSet<String>();
        people.add("Mary");
        people.add("Bob");
        people.add("Joan");
        people.add("Mark");

        //when
        Boolean expected = true;
        //actual
        Boolean actual = people.contains("Bob");
        //then
        Assert.assertEquals(expected,actual);
    }
}
