import java.util.Scanner;

class Shoulders extends Muscle {
    public Shoulders() {
        super("Shoulders");
    }

    public static class FrontHead extends MuscleParts {
        public FrontHead() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Front Raises");
            System.out.println("B) Shoulder Press");
            System.out.println("C) Cable Front Raises");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C"));

            switch (exercise) {
                case "C" -> setExerciseName("Cable Front Raises");
                case "B" -> setExerciseName("Shoulder Press");
                case "A" -> setExerciseName("Front Raises");
            }
        }
    }

    public static class LateralHead extends MuscleParts {
        public LateralHead() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Lateral Raises (Dumbbell)");
            System.out.println("B) Lateral Raises (Cable)");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B"));

            switch (exercise) {
                case "B" -> setExerciseName("Lateral Raises (Cable)");
                case "A" -> setExerciseName("Lateral Raises (Dumbbell)");
            }
        }
    }

    public static class RearHead extends MuscleParts {
        public RearHead() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Rear Delt Flys");
            System.out.println("B) Face Pulls");
            System.out.println("C) Reverse Flys");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C"));

            switch (exercise) {
                case "C" -> setExerciseName("Reverse Flys");
                case "B" -> setExerciseName("Face Pulls");
                case "A" -> setExerciseName("Rear Delt Flys");
            }
        }
    }
}

