import java.util.Scanner;

class Leg extends Muscle {
    public Leg() {
        super("Legs");
    }

    public static class Quadriceps extends MuscleParts {
        public Quadriceps() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Barbell Back Squat");
            System.out.println("B) Leg Press");
            System.out.println("C) Leg Extension");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C"));

            switch (exercise) {
                case "C" -> setExerciseName("Leg Extension");
                case "B" -> setExerciseName("Leg Press");
                case "A" -> setExerciseName("Barbell Back Squat");
            }
        }
    }

    public static class Hamstrings extends MuscleParts {
        public Hamstrings() {
            super();
        }

        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Dead Lift");
            System.out.println("B) Leg Curl");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B"));


            switch (exercise) {
                case "B" -> setExerciseName("Leg Curl");
                case "A" -> setExerciseName("Dead Lift");
            }
        }
    }

    public static class Adductors extends MuscleParts {
        public Adductors() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Standing Cable Hip Adduction");
            System.out.println("B) Seated Hip Adductor Machine");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B"));


            switch (exercise) {
                case "B" -> setExerciseName("Seated Hip Adductor Machine");
                case "A" -> setExerciseName("Standing Cable Hip Adduction");
            }
        }
    }

    public static class Calves extends MuscleParts {
        public Calves() {
            super();
        }

        @Override
        public void SelectExercises() {
            Scanner scanner = new Scanner(System.in);
            String exercise = "";
            System.out.println("A) Standing Calf Raise");
            System.out.println("B) Seated Calf Raise");
            System.out.println("C) Donkey Calf Raise");

            do {
                exercise = scanner.nextLine();
                exercise = exercise.toUpperCase();
            } while(!choiceValidation(exercise, "A", "B", "C"));


            switch (exercise) {
                case "C" -> setExerciseName("Donkey Calf Raise");
                case "B" -> setExerciseName("Seated Calf Raise");
                case "A" -> setExerciseName("Standing Calf Raise");
            }
        }
    }
}
