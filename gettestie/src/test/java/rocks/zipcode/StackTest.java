package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Stack;

public class StackTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackPop(){
        //given
        Stack<String> people = new Stack<>();
        people.push("Bob");
        people.push("Mary");
        people.push("Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = people.pop();
        //then
        Assert.assertEquals(expectedName,actualName) ;
    }

    @org.junit.Test
    public void TestStackPush(){
        //given
        Stack<String> people = new Stack<>();
        people.push("Bob");
        people.push("Mary");
        //when
        String expectedName = "Ana";
        people.push(expectedName);
        //actual
        String actualName = people.peek();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @org.junit.Test
    public void TestStackPeek(){
        //given
        Stack<String> people = new Stack<>();
        people.push("Bob");
        people.push("Mary");
        people.push("Ana");
        //when
        String expectedName = "Ana";
        //actual
        String actualName = people.peek();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

    @org.junit.Test
    public void TestStackIsEmpty(){
        //given
        Stack<String> people = new Stack<>();
        people.push("Bob");
        //when
        people.pop();
        //then
        Assert.assertTrue(people.isEmpty());
    }
}
