package edu.htc.blitstein.helloworld;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

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

    @Test
    public void testOutputFileNormal() throws IOException {
        File file = new File("src/test/resources/testfile.txt");
        PrintStream printStream = new PrintStream(file);
        helloWorld = new HelloWorld(printStream);
        helloWorld.printGreeting("George");
        printStream.close();
        String expectedLine = "Hello, George!";
        InputStream inputStream = new FileInputStream(file);
        Scanner inFile = new Scanner(inputStream);
        String actualLine = inFile.nextLine();
        assertEquals(expectedLine, actualLine);
        inputStream.close();
        boolean isDeleted = file.delete();
        assertTrue(isDeleted);
    }

    @Test(expected = FileNotFoundException.class)
    public void testOutputFileNotFound() throws IOException {
        File file = new File("blah/testfile.txt");
        PrintStream printStream = new PrintStream(file);
        helloWorld = new HelloWorld(printStream);
        helloWorld.printGreeting("George");
        printStream.close();
        String expectedLine = "Hello, George!";
        InputStream inputStream = new FileInputStream(file);
        Scanner inFile = new Scanner(inputStream);
        String actualLine = inFile.nextLine();
        assertEquals(expectedLine, actualLine);
        inputStream.close();
        boolean isDeleted = file.delete();
        assertTrue(isDeleted);
    }
}