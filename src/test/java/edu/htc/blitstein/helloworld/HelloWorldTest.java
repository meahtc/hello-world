package edu.htc.blitstein.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void setUp() {
        helloWorld = new HelloWorld(System.out);
    }

    @Test
    public void testCreateMessageRegular() {
        String name = "Bob";
        String expectedMessage = "Hello, Bob!";
        String actualName = helloWorld.createMessage(name);
        assertEquals(expectedMessage, actualName);
    }

}