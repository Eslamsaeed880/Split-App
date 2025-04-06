import java.util.ArrayList;
import java.util.Scanner;

abstract class Split {
    Split(String splitName) {
        switch (splitName) {
            case "Pro Split" -> numOfDaysRequired = 6;
            case "Push Pull Leg", "Arnold Split" -> Split.numOfDaysRequired = 3;
            case "Upper Lower" -> Split.numOfDaysRequired = 2;
            case "Full Body" -> Split.numOfDaysRequired = 1;
        }
    }

    public void chestExercise() {
        Scanner scanner = new Scanner(System.in);
        String choiceMusclePart = "";
        Muscle chest = new Chest();

        System.out.println("What kind of chest do you want to play ?");
        System.out.println("A) Upper Chest");
        System.out.println("B) Inner Chest");
        System.out.println("C) Lower Chest");
        System.out.println("D) Skip Chest and go to next muscle Exercises");

        do {
            choiceMusclePart = scanner.nextLine();
            choiceMusclePart = choiceMusclePart.toUpperCase();
        } while(!choiceValidation(choiceMusclePart, "A", "B", "C", "D"));

        Exercise exercise = new Exercise();

        switch (choiceMusclePart) {
            case "A" -> {
                Muscle.MuscleParts upperChest = new Chest.UpperChest();
                upperChest.SelectExercises();
                exercise.createExercise(chest, upperChest);
                this.exercise.add(exercise);
            }
            case "B" -> {
                Muscle.MuscleParts innerChest = new Chest.InnerChest();
                innerChest.SelectExercises();
                exercise.createExercise(chest, innerChest);
                this.exercise.add(exercise);
            }
            case "C" -> {
                Muscle.MuscleParts lowerChest = new Chest.LowerChest();
                lowerChest.SelectExercises();
                exercise.createExercise(chest, lowerChest);
                this.exercise.add(exercise);
            }
            case "D" -> {
                System.out.println("Skipped....");
            }
        }

    }

    public void backExercise() {
        Scanner scanner = new Scanner(System.in);
        String choiceMusclePart = "";
        Muscle back = new Back();

        System.out.println("What kind of Back do you want to play ?");
        System.out.println("A) Upper Back");
        System.out.println("B) Lat");
        System.out.println("C) Skip Back and go to next muscle Exercises");

        do {
            choiceMusclePart = scanner.nextLine();
            choiceMusclePart = choiceMusclePart.toUpperCase();
        } while(!choiceValidation(choiceMusclePart, "A", "B", "C"));

        Exercise exercise = new Exercise();

        switch (choiceMusclePart) {
            case "A" -> {
                Muscle.MuscleParts upperBack = new Back.UpperBack();
                upperBack.SelectExercises();
                exercise.createExercise(back, upperBack);
                this.exercise.add(exercise);
            }
            case "B" -> {
                Muscle.MuscleParts lat = new Back.Lats();
                lat.SelectExercises();
                exercise.createExercise(back, lat);
                this.exercise.add(exercise);
            }
            case "C" -> {
                System.out.println("Skipped....");
            }
        }
    }

    public void shouldersExercise(boolean passRear, boolean passOthers) {
        Scanner scanner = new Scanner(System.in);
        String choiceMusclePart = "";
        Muscle shoulder = new Shoulders();
        Exercise exercise = new Exercise();

        if(!passRear && !passOthers) {
            System.out.println("What kind of Shoulder do you want to play ?");
            System.out.println("A) Front Head");
            System.out.println("B) Lateral Head");
            System.out.println("C) Rear Head");
            System.out.println("D) Skip Back and go to next muscle Exercises");

            do {
                choiceMusclePart = scanner.nextLine();
                choiceMusclePart = choiceMusclePart.toUpperCase();
            } while(!choiceValidation(choiceMusclePart, "A", "B", "C", "D"));

        } else if(passRear) {
            System.out.println("What kind of Shoulder do you want to play ?");
            System.out.println("A) Front Head");
            System.out.println("B) Lateral Head");
            System.out.println("C) Skip Back and go to next muscle Exercises");

            do {
                choiceMusclePart = scanner.nextLine();
                choiceMusclePart = choiceMusclePart.toUpperCase();
            } while(!choiceValidation(choiceMusclePart, "A", "B", "C"));

            if(choiceMusclePart.equals("C")) {
                choiceMusclePart = "D";
            }
        } else if(passOthers) {
            System.out.println("What kind of Shoulder do you want to play ?");
            System.out.println("A) Rear Head");
            System.out.println("B) Skip Back and go to next muscle Exercises");

            do {
                choiceMusclePart = scanner.nextLine();
                choiceMusclePart = choiceMusclePart.toUpperCase();
            } while(!choiceValidation(choiceMusclePart, "A", "B"));

            if(choiceMusclePart.equals("A")) {
                choiceMusclePart = "C";
            } else if(choiceMusclePart.equals("B")) {
                choiceMusclePart = "D";
            }
        }
        switch (choiceMusclePart) {
            case "A" -> {
                Muscle.MuscleParts frontHead = new Shoulders.FrontHead();
                frontHead.SelectExercises();
                exercise.createExercise(shoulder, frontHead);
                this.exercise.add(exercise);
            }
            case "B" -> {
                Muscle.MuscleParts lateralHead = new Shoulders.LateralHead();
                lateralHead.SelectExercises();
                exercise.createExercise(shoulder, lateralHead);
                this.exercise.add(exercise);
            }
            case "C" -> {
                Muscle.MuscleParts rearHead = new Shoulders.RearHead();
                rearHead.SelectExercises();
                exercise.createExercise(shoulder, rearHead);
                this.exercise.add(exercise);
            }
            case "D" -> {
                System.out.println("Skipped....");
            }

        }
    }

    public void armsExercise(boolean passTriceps, boolean passBiceps) {
        Scanner scanner = new Scanner(System.in);
        String choiceMusclePart = "";
        Muscle arm = new Arms();
        Exercise exercise = new Exercise();

        if(!passTriceps && !passBiceps) {
            System.out.println("What kind of Arm do you want to play ?");
            System.out.println("A) Biceps");
            System.out.println("B) Triceps");
            System.out.println("C) Skip Back and go to next muscle Exercises");

            do {
                choiceMusclePart = scanner.nextLine();
                choiceMusclePart = choiceMusclePart.toUpperCase();
            } while(!choiceValidation(choiceMusclePart, "A", "B", "C"));
        } else if(passTriceps) {
            System.out.println("A) Biceps");
            System.out.println("B) Skip Biceps and go to next muscle Exercises");

            do {
                choiceMusclePart = scanner.nextLine();
                choiceMusclePart = choiceMusclePart.toUpperCase();
            } while(!choiceValidation(choiceMusclePart, "A", "B"));

            if(choiceMusclePart.equals("B")) {
                return;
            }
        } else if(passBiceps) {
            System.out.println("A) Triceps");
            System.out.println("B) Skip Triceps and go to next muscle Exercises");

            do {
                choiceMusclePart = scanner.nextLine();
                choiceMusclePart = choiceMusclePart.toUpperCase();
            } while(!choiceValidation(choiceMusclePart, "A", "B"));

            if(choiceMusclePart.equals("B")) {
                return;
            } else if(choiceMusclePart.equals("A")) {
                choiceMusclePart = "B";
            }
        }

        switch (choiceMusclePart) {
            case "A" -> {
                Muscle.MuscleParts biceps = new Arms.Biceps();
                biceps.SelectExercises();
                exercise.createExercise(arm, biceps);
                this.exercise.add(exercise);
            }
            case "B" -> {
                Muscle.MuscleParts triceps = new Arms.Triceps();
                triceps.SelectExercises();
                exercise.createExercise(arm, triceps);
                this.exercise.add(exercise);
            }
            case "C" -> {
                System.out.println("Skipped....");
            }
        }
    }

    public void legExercise() {
        Scanner scanner = new Scanner(System.in);
        String choiceMusclePart = "";
        Muscle leg = new Leg();

        System.out.println("What kind of Leg do you want to play ?");
        System.out.println("A) Quadriceps");
        System.out.println("B) Hamstrings");
        System.out.println("C) Adductors");
        System.out.println("D) Calves");
        System.out.println("E) Skip Leg and go to next muscle Exercises");

        do {
            choiceMusclePart = scanner.nextLine();
            choiceMusclePart = choiceMusclePart.toUpperCase();
        } while(!choiceValidation(choiceMusclePart, "A", "B", "C", "D", "E"));

        Exercise exercise = new Exercise();

        switch (choiceMusclePart) {
            case "A" -> {
                Muscle.MuscleParts quadriceps = new Leg.Quadriceps();
                quadriceps.SelectExercises();
                exercise.createExercise(leg, quadriceps);
                this.exercise.add(exercise);
            }
            case "B" -> {
                Muscle.MuscleParts hamstrings = new Leg.Hamstrings();
                hamstrings.SelectExercises();
                exercise.createExercise(leg, hamstrings);
                this.exercise.add(exercise);
            }
            case "C" -> {
                Muscle.MuscleParts adductors = new Leg.Adductors();
                adductors.SelectExercises();
                exercise.createExercise(leg, adductors);
                this.exercise.add(exercise);
            }
            case "D" -> {
                Muscle.MuscleParts calves = new Leg.Calves();
                calves.SelectExercises();
                exercise.createExercise(leg, calves);
                this.exercise.add(exercise);
            }
            case "E" -> {
                System.out.println("Skipped....");
            }
        }
    }


    public abstract void day1();

    public abstract void day2();

    public abstract void day3();

    public abstract void day4();

    public abstract void day5();

    public boolean isEmpty() {
        return this.exercise.isEmpty();
    }

    public void printSplit() {
        int i = 1;
        System.out.println("-------------------------------------------------------------------");
        System.out.println(this.getSplitName());
        System.out.println("-------------------------------------------------------------------");
        for(Exercise exercise : this.exercise) {
            exercise.printExercise(i++);
        }
        System.out.println("-------------------------------------------------------------------");
    }

    public Exercise getExercise(int i) {
        return exercise.get(i);
    }

    public static void setNumOfDaysRequired(int numOfDaysRequired) {
        Split.numOfDaysRequired = numOfDaysRequired;
    }

    public static int getNumOfDaysRequired() {
        return Split.numOfDaysRequired;
    }

    public String getSplitName() {
        return splitName;
    }

    public void setSplitName(String splitName) {
        this.splitName = splitName;
    }

    public int size() {
        return this.exercise.size();
    }

    protected boolean choiceValidation(String userChoice, String ... choice) {
        for(String s : choice) {
            if(userChoice.equals(s)) {
                return true;
            }
        }
        return false;
    }

    private static int numOfDaysRequired;

    protected String splitName;

    protected ArrayList<Exercise> exercise = new ArrayList<>();
}
