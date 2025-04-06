import java.util.Scanner;

class UpperAndLower extends Split {

    public UpperAndLower() {
        super("Upper Lower");
    }

    // Upper Day
    @Override
    public void day1() {
        Scanner scanner = new Scanner(System.in);
        String muscle = "";
        System.out.println("The allowed muscles in this day are:");
        System.out.println("A) Chest");
        System.out.println("B) Back");
        System.out.println("C) Shoulders");
        System.out.println("D) Arms");
        System.out.println("Select one Muscle to play");

        do {
            muscle = scanner.nextLine();
            muscle = muscle.toUpperCase();
        } while(!choiceValidation(muscle, "A", "B", "C", "D"));

        switch (muscle) {
            case "A" -> chestExercise();
            case "B" -> backExercise();
            case "C" -> shouldersExercise(false, false);
            case "D" -> armsExercise(false, false);
        }
    }

    // Lower Day
    @Override
    public void day2() {
        legExercise();
    }

    @Override
    public void day3() {}

    @Override
    public void day4() {}

    @Override
    public void day5() {}

}

