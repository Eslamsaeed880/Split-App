abstract class Muscle {
    public Muscle() {
        muscleName = "Muscle";
    }

    public Muscle(String muscleName) {
        this.muscleName = muscleName;
    }

    public abstract static class MuscleParts {
        public MuscleParts() {
            this.weaknessPoint = false;
        }

        public void setExerciseName(String exerciseName) {
            this.exerciseName = exerciseName;
        }

        public String getExerciseName() {
            return exerciseName;
        }

        public abstract void SelectExercises();

        protected boolean weaknessPoint;
        private String exerciseName;
    }

    protected void setMuscleName(String muscleName) {
        this.muscleName = muscleName;
    }

    protected String getMuscleName() {
        return muscleName;
    }

    protected static boolean choiceValidation(String userChoice, String... choice) {
        for(String s : choice) {
            if(userChoice.equals(s)) {
                return true;
            }
        }
        return false;
    }

    private String muscleName;
}

