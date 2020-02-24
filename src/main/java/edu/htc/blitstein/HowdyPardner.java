package edu.htc.blitstein;

import edu.htc.blitstein.helloworld.HelloWorld;

import java.io.PrintStream;

public class HowdyPardner {
    public static void main(String... args) {
        final String defaultName = "Pardner";
        PrintStream printStream = System.out;
        HelloWorld hw = new HelloWorld(printStream);
        if (args.length == 0) {
            hw.printGreeting(defaultName);
        } else for (String name : args){
            hw.printGreeting(name);
        }
    }
}
