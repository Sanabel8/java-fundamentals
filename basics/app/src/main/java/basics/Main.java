package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
public class Main {

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        } else {
            return word;
        }
    }
    public static void flipNHeads(int n) {
        int Flips = 0;
        int numOFHeads = 0;
        while (numOFHeads != n) {
            Flips = Flips + 1;
            Random rand = new Random(); // instance of random class
            double double_random = rand.nextDouble();
            // System.out.println(double_random);
            if (double_random >= 0.5) {
                System.out.println("heads");
                numOFHeads = numOFHeads + 1;
            } else {
                System.out.println("tails ");
                numOFHeads = 0;
            }
        }
        System.out.println("It took " + Flips + " flips to flip " + numOFHeads + " heads in a row .");
    }
    public static void clock(){
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            int sec = now.getSecond();
            if (sec !=LocalDateTime.now().getSecond()) {
                System.out.println(time);
            }
        }
    }
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(11);
        clock();
    }
}