package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIteratorNext(){
        //given
        ArrayList<String> people = new ArrayList<>();
        people.add("Mary");
        people.add("Bob");
        people.add("Ana");
        //when
        Iterator<String> iter = people.iterator();
        String expected = "Mary";
        //actual
        String actual = iter.next();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestIteratorHasNext(){
        //given
        ArrayList<String> people = new ArrayList<>();
        people.add("Mary");
        people.add("Bob");
        people.add("Ana");
        //when
        StringBuilder answer = new StringBuilder();
        Iterator<String> iter = people.iterator();
        while (iter.hasNext()){
            iter.next();
            answer.append("true");
        }
        String expected = "truetruetrue";
        //actual
        String actual = answer.toString();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestIteratorRemove(){
        //given
        ArrayList<String> people = new ArrayList<>();
        people.add("Mary");
        people.add("Bob");
        people.add("Ana");
        //when
        Iterator<String> iter = people.iterator();
        while (iter.hasNext()){
            String person = iter.next();
            if (person == "Bob") {
                iter.remove();
            }
        }
        Integer expected = 2;
        //actual
        Integer actual = people.size();
        //then
        Assert.assertEquals(expected,actual);
    }
}
