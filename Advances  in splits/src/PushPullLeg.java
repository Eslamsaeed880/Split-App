import java.util.Scanner;

class PushPullLeg extends Split {
    public PushPullLeg() {
        super("Push Pull Leg");
        setNumOfDaysRequired(3);
    }

    // Push Day
    @Override
    public void day1() {
        Scanner scanner = new Scanner(System.in);
        String muscle = "";
        System.out.println("The allowed muscles in this day are:");
        System.out.println("A) Chest");
        System.out.println("B) Shoulders");
        System.out.println("C) Triceps");
        System.out.println("Select one Muscle to play");

        do {
            muscle = scanner.nextLine();
            muscle = muscle.toUpperCase();
        } while(!choiceValidation(muscle, "A", "B", "C"));

        switch (muscle) {
            case "A" -> chestExercise();
            case "B" -> shouldersExercise(true, false);
            case "C" -> armsExercise(false, true);
        }
    }

    // Pull Day
    @Override
    public void day2() {
        Scanner scanner = new Scanner(System.in);
        String muscle = "";
        System.out.println("The allowed muscles in this day are:");
        System.out.println("A) Back");
        System.out.println("B) Rear Head Shoulders");
        System.out.println("C) Biceps");
        System.out.println("Select one Muscle to play");

        do {
            muscle = scanner.nextLine();
            muscle = muscle.toUpperCase();
        } while(!choiceValidation(muscle, "A", "B", "C"));

        switch (muscle) {
            case "A" -> backExercise();
            case "B" -> shouldersExercise(false, true);
            case "C" -> armsExercise(true, false);
        }
    }

    // Leg Day
    @Override
    public void day3() {
        legExercise();
    }

    @Override
    public void day4() {}

    @Override
    public void day5() {}
}

