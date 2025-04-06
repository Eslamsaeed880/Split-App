import java.util.Scanner;

class Back extends Muscle {
    public Back() {
        super("Back");
    }

    public static class UpperBack extends MuscleParts {
        public UpperBack() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) T-Bar Row");
            System.out.println("B) Lat Pulldown (Wide Grip)");
            System.out.println("C) Seated Cable Rows (Wide Grip)");
            System.out.println("D) Straight-Arm Pulldowns");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C", "D"));

            switch (exercise) {
                case "D" -> setExerciseName("Straight-Arm Pulldowns");
                case "C" -> setExerciseName("Seated Cable Rows (Wide Grip)");
                case "B" -> setExerciseName("Lat Pulldown (Wide Grip)");
                case "A" -> setExerciseName("T-Bar Row");
            }
        }

    }

    public static class Lats extends MuscleParts {
        public Lats() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Lat Pulldown");
            System.out.println("B) Pull Ups");
            System.out.println("C) Barbell Bent-Over Rows (Underhand Grip)");
            System.out.println("D) Seated Cable Rows (Close Grip or V-Grip)");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C", "D"));

            switch (exercise) {
                case "D" -> setExerciseName("Seated Cable Rows (Close Grip or V-Grip)");
                case "C" -> setExerciseName("Barbell Bent-Over Rows (Underhand Grip)");
                case "B" -> setExerciseName("Pull Ups");
                case "A" -> setExerciseName("Lat Pulldown");
            }
        }
    }
}

