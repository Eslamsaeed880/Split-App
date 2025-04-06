import java.util.Scanner;

class Chest extends Muscle {
    public Chest() {
        super("Chest");
    }

    public static class UpperChest extends MuscleParts {
        public UpperChest() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Incline Barbell Bench Press");
            System.out.println("B) Incline Dumbell Bench Press");
            System.out.println("C) Incline Smith Machine Press");
            System.out.println("D) Incline Machine Press");
            System.out.println("E) Low-to-High cable flys");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C", "D", "E"));

            switch (exercise) {
                case "E" -> setExerciseName("Low-to-High cable flys");
                case "D" -> setExerciseName("Incline Machine Press");
                case "C" -> setExerciseName("Incline Smith Machine Press");
                case "B" -> setExerciseName("Incline Dumbell Bench Press");
                case "A" -> setExerciseName("Incline Barbell Bench Press");
            }
        }
    }

    public static class InnerChest extends MuscleParts {
        public InnerChest() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Close-Grip Bench Press");
            System.out.println("B) Dumbell Bench Press");
            System.out.println("C) Chest Fly Machine");
            System.out.println("D) Dumbbell Squeeze Press");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C", "D"));

            switch (exercise) {
                case "D" -> setExerciseName("Dumbbell Squeeze Press");
                case "C" -> setExerciseName("Chest Fly Machine");
                case "B" -> setExerciseName("Dumbell Bench Press");
                case "A" -> setExerciseName("Close-Grip Bench Press");
            }
        }
    }

    public static class LowerChest extends MuscleParts {
        public LowerChest() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";

            System.out.println("A) High-to-Low Cable Fly");
            System.out.println("B) Decline Machine Press");
            System.out.println("C) Dips (Chest-Focused)");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C"));

            switch (exercise) {
                case "C" -> setExerciseName("Dips (Chest-Focused)");
                case "B" -> setExerciseName("Decline Machine Pres");
                case "A" -> setExerciseName("High-to-Low Cable Fly");
            }
        }
    }

}

