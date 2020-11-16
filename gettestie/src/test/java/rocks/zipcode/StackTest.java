package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;

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
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Mary");
        people.add("Ana");
        //when
        String expectedBrand = "Sally";
        people.set(0,"Sally");
        //actual
        String actualBrand = people.get(0);
        //then
        Assert.assertEquals(expectedBrand,actualBrand) ;
    }

    @org.junit.Test
    public void TestStackPush(){
        //given
        //when
        //actual
        //then
    }

    @org.junit.Test
    public void TestStackPeek(){
        //given
        //when
        //actual
        //then
    }

    @org.junit.Test
    public void TestStackIsEmpty(){
        //given
        //when
        //actual
        //then
    }
}
