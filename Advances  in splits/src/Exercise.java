import java.util.ArrayList;

class Exercise {

    public void createExercise(Muscle muscle, Muscle.MuscleParts muscleParts) {
        this.muscle = muscle;
        this.muscleParts = muscleParts;
    }

    public void practiceRepsSetsWeight(int reps, int set, float weight) {
        if(this.weight.get(set - 1) < weight) {
            this.weight.set(set - 1, weight);
            this.reps.set(set - 1, reps);
        } else if(this.weight.get(set - 1).equals(weight)) {
            this.reps.set(set - 1, Math.max(this.reps.get(set - 1), reps));
        }
    }

    public void editRepsSetsWeight(int reps, int set, float weight) {
        this.reps.set(set - 1, reps);
        this.weight.set(set - 1, weight);
    }

    public void addRepsSetsWeight(int reps, float weight) {
        this.sets++;
        this.reps.add(reps);
        this.weight.add(weight);
    }

    public Muscle getMuscle() {
        return this.muscle;
    }

    public Muscle.MuscleParts getMuscleParts() {
        return this.muscleParts;
    }

    public void printExercise(int index) {
        System.out.println(index + "- Exercise: " + this.muscle.getMuscleName() + " (" + this.muscleParts.getExerciseName() + ")");
        System.out.println("Sets: " + this.sets);
        for(int i = 0; i < this.sets; i++) {
            System.out.println("Reps " + (i + 1) + ": " + this.reps.get(i));
            System.out.println("Weight " + (i + 1) + ": " + this.weight.get(i));
            System.out.println();
        }
    }

    public void printExercise() {
        System.out.println("Exercise: " + this.muscle.getMuscleName() + " (" + this.muscleParts.getExerciseName() + ")");
        System.out.println("Sets: " + this.sets);
        for(int i = 0; i < this.sets; i++) {
            System.out.println("Reps " + (i + 1) + ": " + this.reps.get(i));
            System.out.println("Weight " + (i + 1) + ": " + this.weight.get(i));
            System.out.println();
        }
    }

    public int getSets() {
        return this.sets;
    }

    public static void breakTime(int seconds) {
        System.out.println("\nStarting break for " + seconds + " seconds...");
        for (int i = seconds; i > 0; i--) {
            System.out.println("Time left: " + i + " seconds");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Break interrupted.");
            }
        }
        System.out.println("Break over! Time to continue.\n");
    }

    public void removeSet(int setIndex) {
        this.sets--;
        this.reps.remove(setIndex);
        this.weight.remove(setIndex);
    }

    private Muscle muscle;

    private Muscle.MuscleParts muscleParts;

    private int sets;

    private ArrayList<Integer> reps = new ArrayList<>();

    private ArrayList<Float> weight = new ArrayList<>();
}

