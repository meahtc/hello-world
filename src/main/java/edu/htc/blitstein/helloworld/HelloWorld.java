package edu.htc.blitstein.helloworld;

import java.io.PrintStream;

public class HelloWorld {
    private String salutation = "Hello";
    private PrintStream printStream;

    public HelloWorld(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printGreeting(String name) {
        printStream.println(createMessage(name));
    }

    String createMessage(String name) {
        return salutation + ", " + name + "!";
    }
}
