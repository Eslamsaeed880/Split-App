import java.util.Scanner;

class Arms extends Muscle {
    public Arms() {
        super("Arms");
    }

    public static class Triceps extends MuscleParts {
        public Triceps() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Triceps Push Down");
            System.out.println("B) Triceps Overhead");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B"));

            switch (exercise) {
                case "B" -> setExerciseName("Triceps Overhead");
                case "A" -> setExerciseName("Triceps Push Down");
            }
        }
    }

    public static class Biceps extends MuscleParts {
        public Biceps() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Biceps Curls");
            System.out.println("B) Cable Zottman Curl");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B"));

            switch (exercise) {
                case "B" -> setExerciseName("Cable Zottman Curl");
                case "A" -> setExerciseName("Biceps Curls");
            }
        }
    }
}

