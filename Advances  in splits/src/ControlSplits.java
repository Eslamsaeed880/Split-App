import java.util.ArrayList;
import java.util.Scanner;

class ControlSplits {
    public void createSplit() {
        Scanner scanner = new Scanner(System.in);
        Split split;
        String splitName;
        String choiceSplit = "";
        System.out.println("What name do you want to call your Day Workout?");
        splitName = scanner.nextLine();

        System.out.println("Choose a split to play");
        System.out.println("A) Push Pull Leg");
        System.out.println("B) Arnold Split");
        System.out.println("C) Upper Lower");
        System.out.println("D) Full Body Workout");
        System.out.println("E) Bro Split");
        System.out.println("F) Exit Program");

        do {
            choiceSplit = scanner.nextLine();
            choiceSplit = choiceSplit.toUpperCase();
        } while (!choiceValidation(choiceSplit, "A", "B", "C", "D", "E", "F"));

        switch (choiceSplit) {
            case "A" -> {

                split = new PushPullLeg();
                split.setSplitName(splitName);
                System.out.println("A) Push");
                System.out.println("B) Pull");
                System.out.println("C) Leg");

                do {
                    choiceSplit = scanner.nextLine();
                    choiceSplit = choiceSplit.toUpperCase();
                } while (!choiceValidation(choiceSplit, "A", "B", "C"));

                switch (choiceSplit) {
                    case "A" -> {
                        do {
                            split.day1();
                        } while(anotherExercise());
                    }
                    case "B" -> {
                        do {
                            split.day2();
                        } while(anotherExercise());
                    }
                    case "C" -> {
                        do {
                            split.day3();
                        } while(anotherExercise());
                    }
                }

                this.splits.add(split);
            }
            case "B" -> {
                split = new ArnoldSplit();
                split.setSplitName(splitName);
                System.out.println("A) Chest and Back");
                System.out.println("B) Arms And Shoulders");
                System.out.println("C) Legs");

                do {
                    choiceSplit = scanner.nextLine();
                    choiceSplit = choiceSplit.toUpperCase();
                } while (!choiceValidation(choiceSplit, "A", "B", "C"));

                switch (choiceSplit) {
                    case "A" -> {
                        do {
                            split.day1();
                        } while(anotherExercise());
                    }
                    case "B" -> {
                        do {
                            split.day2();
                        } while(anotherExercise());
                    }
                    case "C" -> {
                        do {
                            split.day3();
                        } while(anotherExercise());
                    }
                }

                this.splits.add(split);
            }
            case "C" -> {
                split = new UpperAndLower();
                split.setSplitName(splitName);
                System.out.println("A) Upper Day");
                System.out.println("B) Lower Day");

                do {
                    choiceSplit = scanner.nextLine();
                    choiceSplit = choiceSplit.toUpperCase();
                } while (!choiceValidation(choiceSplit, "A", "B"));

                switch (choiceSplit) {
                    case "A" -> {
                        do {
                            split.day1();
                        } while(anotherExercise());
                    }
                    case "B" -> {
                        do {
                            split.day2();
                        } while(anotherExercise());
                    }
                }

                this.splits.add(split);
            }
            case "D" -> {
                split = new FullBody();
                split.setSplitName(splitName);

                do {
                    split.day1();
                } while(anotherExercise());

                this.splits.add(split);
            }
            case "E" -> {
                split = new BroSplit();
                split.setSplitName(splitName);
                System.out.println("A) Chest");
                System.out.println("B) Back");
                System.out.println("C) Shoulders");
                System.out.println("D) Arms");
                System.out.println("E) Legs");

                do {
                    choiceSplit = scanner.nextLine();
                    choiceSplit = choiceSplit.toUpperCase();
                } while (!choiceValidation(choiceSplit, "A", "B"));

                switch (choiceSplit) {
                    case "A" -> {
                        do {
                            split.day1();
                        } while(anotherExercise());
                    }
                    case "B" -> {
                        do {
                            split.day2();
                        } while(anotherExercise());
                    }
                    case "C" -> {
                        do {
                            split.day3();
                        } while(anotherExercise());
                    }
                    case "D" -> {
                        do {
                            split.day4();
                        } while(anotherExercise());
                    }
                    case "E" -> {
                        do {
                            split.day5();
                        } while(anotherExercise());
                    }
                }

                this.splits.add(split);
            }
        }
    }

    public void printSplits() {
        for(int i = 0; i < this.splits.size(); i++) {
            System.out.println("\nDay " + (i + 1) + ":");
            this.splits.get(i).printSplit();
        }
    }

    public void choosePracticeManage() {
        Scanner scanner = new Scanner(System.in);
        Split split;
        Exercise exercise;
        String practice = "";
        int splitIndex;
        int exerciseIndex;
        printSplits();
        splitIndex = chooseSplit();
        if(splitIndex == -1) {
            return;
        }
        split = this.splits.get(splitIndex);
        // Practice
        System.out.println("A) Practice");
        System.out.println("B) Manage sets");
        System.out.println("C) Exit");
        do {
            practice = scanner.nextLine();
            practice = practice.trim();
        } while (!choiceValidation(practice, "A", "B", "C"));

        switch (practice) {
            case "A" -> {
                do {
                    split.printSplit();
                    exerciseIndex = chooseExercise(splits.get(splitIndex));
                    if(exerciseIndex == -1) {
                        break;
                    }
                    exercise = split.getExercise(exerciseIndex);
                    System.out.println("\nExercise " + (exerciseIndex + 1) + ":");
                    exercise.printExercise(exerciseIndex + 1);
                } while(practice(exercise));
            }
            case "B" -> {
                do {
                    split.printSplit();
                    exerciseIndex = chooseExercise(splits.get(splitIndex));
                    if(exerciseIndex == -1) {
                        break;
                    }
                    exercise = split.getExercise(exerciseIndex);
                    System.out.println("\nExercise " + (exerciseIndex + 1) + ":");
                    exercise.printExercise(exerciseIndex + 1);
                } while (manageSets(exercise));
            }
        }
    }

    public boolean practice(Exercise exercise) {
        Scanner scanner = new Scanner(System.in);
        int breakTime = 0, reps, setNumber;
        float weight;
        System.out.println("Choose the set number you'll play (Press -1 to exit): ");
        do {
            setNumber = scanner.nextInt();
            if(setNumber == -1) {
                return false;
            }
        } while (setNumber > exercise.getSets() + 1 || setNumber < 0);
        System.out.println("Enter the number of reps for this exercise: ");
        reps = scanner.nextInt();
        System.out.println("Enter the weight for this exercise: ");
        weight = scanner.nextFloat();

        if(setNumber == exercise.getSets() + 1) {
            exercise.addRepsSetsWeight(reps, weight);
        }
        else {
            exercise.practiceRepsSetsWeight(reps, setNumber, weight);
        }
        System.out.println("How many seconds would you take for break ?");
        breakTime = scanner.nextInt();
        Exercise.breakTime(breakTime);
        return true;
    }

    public void removeDay() {
        int splitIndex = 0;
        printSplits();
        System.out.println("What Day would you like to remove?");
        splitIndex = chooseSplit();
        if(splitIndex != -1) {
            if(splits.size() >= 1) {
                this.splits.remove(splitIndex);
            }
        } else {
            System.out.println("There's nothing to remove");
        }
    }

    private int chooseSplit() {
        Scanner scanner = new Scanner(System.in);
        int choiceSplit = 0;
        if(this.splits.isEmpty()) {
            return -1;
        }
        System.out.println("Select a Day Workout (Press -1 to exit)");

        do {
            choiceSplit = scanner.nextInt();
            if(choiceSplit == -1) {
                return -1;
            }
        } while (choiceSplit < 1 || choiceSplit > this.splits.size());
        return --choiceSplit;
    }

    private int chooseExercise(Split split) {
        Scanner scanner = new Scanner(System.in);
        int choiceExercise = 0;
        if(split.isEmpty()) {
            return -1;
        }
        System.out.println("Select an exercise to play (Press -1 to exit)");

        do {
            choiceExercise = scanner.nextInt();
            if(choiceExercise == -1) {
                return -1;
            }
        } while (choiceExercise < 1 || choiceExercise > split.size());
        return --choiceExercise;
    }

    private boolean manageSets(Exercise exercise) {
        Scanner scanner = new Scanner(System.in);
        String choiceSet = "";
        int reps;
        float weight;
        System.out.println("A) Add Set");
        System.out.println("B) Edit Set");
        System.out.println("C) Remove Set");
        System.out.println("D) Exit");
        do {
            choiceSet = scanner.nextLine();
            choiceSet = choiceSet.toUpperCase();
        } while (!choiceValidation(choiceSet, "A", "B", "C", "D"));

        switch (choiceSet) {
            case "A" -> {
                System.out.println("Add Reps You've done");
                reps = scanner.nextInt();
                System.out.println("Add Weights You've left");
                weight = scanner.nextFloat();
                exercise.addRepsSetsWeight(reps, weight);
            }
            case "B" -> {
                int setIndex;
                System.out.println("What set do you want to edit (Press -1 to exit)");

                do {
                    setIndex = scanner.nextInt();
                    if(setIndex == -1) {
                        break;
                    }
                } while (setIndex > exercise.getSets() || setIndex < 0);

                System.out.println("Edit Reps You've done");
                reps = scanner.nextInt();
                System.out.println("Edit Weights You've left");
                weight = scanner.nextFloat();
                exercise.editRepsSetsWeight(reps, setIndex, weight);
            }
            case "C" -> {
                int setIndex;
                System.out.println("What set do you want to remove (Press -1 to exit)");

                do {
                    setIndex = scanner.nextInt();
                    if(setIndex == -1) {
                        return false;
                    }
                } while (setIndex > exercise.getSets() || setIndex < 0);

                exercise.removeSet(setIndex - 1);
            }
            case "D" -> {
                return false;
            }
        }
        return true;
    }

    private boolean anotherExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Another exercise ?");
        System.out.println("A) Yes");
        System.out.println("B) No");
        String answer = "";
        do {
            answer = scanner.nextLine();
            answer = answer.toUpperCase();
        } while (!choiceValidation(answer, "A", "B"));

        return answer.equals("A");
    }

    private boolean choiceValidation(String userChoice, String ... choice) {
        for(String s : choice) {
            if(userChoice.equals(s)) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<Split> splits = new ArrayList<>();
}