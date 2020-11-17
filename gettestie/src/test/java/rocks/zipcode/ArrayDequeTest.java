package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeMap;

public class ArrayDequeTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDequeGetFirst1(){
        //given
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Mary");
        stack.push("Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = stack.getFirst();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestArrayDequeGetFirst2(){
        //given
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Mary");
        queue.offer("Ana");
        //when
        String expectedName = "Mary";
        //actual
        String actualName = queue.getFirst();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestArrayDequePop(){
        //given
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Mary");
        stack.push("Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = stack.pop();
        //then
        Assert.assertEquals(expectedName,actualName);
    }

    @org.junit.Test
    public void TestArrayDequePoll(){
        //given
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Mary");
        queue.offer("Ana");
        //when
        String expectedName = "Mary";
        //actual
        String actualName = queue.poll();
        //then
        Assert.assertEquals(expectedName,actualName);
    }
}
