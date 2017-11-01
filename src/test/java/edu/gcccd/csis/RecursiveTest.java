package edu.gcccd.csis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RecursiveTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printStarsTest1() {
        String myTest = Recursive.printStars("Bobby");
        assertEquals("Bob*by",myTest);
    }

    @Test
    public void printStarsTest2() {
        String myTest = Recursive.printStars("lollipop");
        assertEquals("lol*lipop",myTest);
    }

    @Test
    public void printStarsTest3() {
        String myTest = Recursive.printStars("mississippi");
        assertEquals("mis*sis*sip*pi",myTest);
    }

    @Test
    public void printStarsTest4() {
        String myTest = Recursive.printStars("miSsissippi");
        assertEquals("miSsis*sip*pi",myTest);
    }

    @Test
    public void printStarsTest5() {
        String myTest = Recursive.printStars("1011");
        assertEquals("101*1",myTest);
    }

    @Test
    public void printStarsTest6() {
        String myTest = Recursive.printStars(null);
        assertEquals(null,myTest);
    }

    @Test
    public void printStarsTest7() {
        String myTest = Recursive.printStars("a");
        assertEquals("a",myTest);
    }

    @Test
    public void printEveryOtherTest1() {
        Recursive.printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10},2);
        assertEquals("9753",outContent.toString());
    }

    @Test
    public void printEveryOtherTest2() {
        Recursive.printEveryOther(new int[]{2,4,6,8,10,12,14,16,18,20,22}, 2);
        assertEquals("221814106",outContent.toString());
    }

    @Test
    public void printEveryOtherTest3() {
        Recursive.printEveryOther(new int[]{2,4,6,8,10,12,14,16,18,20}, 3);
        assertEquals("2016128",outContent.toString());
    }

    @Test
    public void printEveryOtherTest4() {
        Recursive.printEveryOther(new int[]{}, 2);
        assertEquals("",outContent.toString());
    }

    @Test
    public void printEveryOtherTest5() {
        Recursive.printEveryOther(new int[]{1}, 2);
        assertEquals("",outContent.toString());
    }

    @Test
    public void printEveryOtherTest6() {
        Recursive.printEveryOther(new int[]{1}, 0);
        assertEquals("1",outContent.toString());
    }


}
