package edu.htc.blitstein;

public class HowdyPardner {
    public static void main(String... args) {
        String name = "Doody";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Howdy, " + name + "!");
    }
}
