import jdk.jshell.Snippet;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class SplitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlSplits controlSplits = new ControlSplits();
        while(true) {
            System.out.println("A) Create a Day Workout");
            System.out.println("B) Print a Day Workout");
            System.out.println("C) Choose a Workout to practice or manage sets and reps");
            System.out.println("D) Delete a Workout");
            System.out.println("E) Stop");
            String choice = scanner.nextLine();
            choice = choice.toUpperCase();
            switch (choice) {
                case "A" -> controlSplits.createSplit();
                case "B" -> controlSplits.printSplits();
                case "C" -> controlSplits.choosePracticeManage();
                case "D" -> controlSplits.removeDay();
                case "E" -> {
                    System.out.println("Stop...");
                    return;
                }
            }
        }
    }

}