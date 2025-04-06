import java.util.Scanner;

class ArnoldSplit extends Split {
    public ArnoldSplit() {
        super("Arnold Split");
    }

    // Chest and Back Day
    @Override
    public void day1() {
        Scanner scanner = new Scanner(System.in);
        String muscle = "";
        System.out.println("The allowed muscles in this day are:");
        System.out.println("A) Chest");
        System.out.println("B) Back");
        System.out.println("Select one Muscle to play");

        do {
            muscle = scanner.nextLine();
            muscle = muscle.toUpperCase();
        } while(!choiceValidation(muscle, "A", "B"));

        switch (muscle) {
            case "A" -> chestExercise();
            case "B" -> backExercise();
        }
    }

    // Shoulders and Arms Day
    @Override
    public void day2() {
        Scanner scanner = new Scanner(System.in);
        String muscle = "";
        System.out.println("The allowed muscles in this day are:");
        System.out.println("A) Shoulders");
        System.out.println("B) Arms");
        System.out.println("Select one Muscle to play");

        do {
            muscle = scanner.nextLine();
            muscle = muscle.toUpperCase();
        } while(!choiceValidation(muscle, "A", "B"));

        switch (muscle) {
            case "A" -> shouldersExercise(false, false);
            case "B" -> armsExercise(false, false);
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

