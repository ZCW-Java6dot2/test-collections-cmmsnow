package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQueuePoll(){
        //given
        PriorityQueue<String> people = new PriorityQueue<>();
        people.add("Mary");
        people.add("Bob");
        people.add("Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = people.poll();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestPriorityQueuePeek(){
        //given
        PriorityQueue<String> people = new PriorityQueue<>();
        people.add("Mary");
        people.add("Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = people.peek();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestPriorityQueueAdd(){
        //given
        PriorityQueue<String> people = new PriorityQueue<>();
        people.add("Mary");
        people.add("Ana");
        //when
        Integer expectedSize = people.size()+1;
        people.add("Bob");
        //actual
        Integer actualSize = people.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
