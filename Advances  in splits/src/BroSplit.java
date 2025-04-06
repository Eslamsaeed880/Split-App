class BroSplit extends Split {

    public BroSplit() {
        super("Bro Split");
    }

    // Chest Day
    @Override
    public void day1() {
        chestExercise();
    }

    // Back Day
    @Override
    public void day2() {
        backExercise();
    }

    // Shoulder Day
    @Override
    public void day3() {
        shouldersExercise(false, false);
    }

    // Arm Day
    @Override
    public void day4() {
        armsExercise(false, false);
    }

    // Leg Day
    @Override
    public void day5() {
        legExercise();
    }
}

