# Workout Split App

![Fitness App](https://img.icons8.com/color/96/000000/fitness.png)

A Java application to manage and track your workout splits and exercises.

## Features

- 🏋️‍♂️ Multiple workout split options:
  - Push-Pull-Legs (PPL)
  - Arnold Split
  - Upper-Lower
  - Full Body
  - Bro Split
- 💪 Detailed muscle group targeting:
  - Chest (Upper/Inner/Lower)
  - Back (Upper/Lats)
  - Shoulders (Front/Lateral/Rear)
  - Arms (Biceps/Triceps)
  - Legs (Quadriceps/Hamstrings/Adductors/Calves)
- 📊 Track sets, reps, and weights
- ⏱ Built-in rest timer
- 📝 Save and manage multiple workout days
- ✏️ Edit existing workouts

## How to Use

1. Clone the repository or download the source files
2. Compile and run `SplitApp.java`
3. Follow the menu prompts to:
   - Create new workout days
   - Print your existing workouts
   - Practice exercises and track performance
   - Manage sets and reps
   - Delete workouts

## Class Structure

- `SplitApp.java`: Main application class
- `ControlSplits.java`: Manages workout splits and exercises
- `Split.java`: Abstract base class for all workout splits
- Concrete split classes:
  - `PushPullLeg.java`
  - `ArnoldSplit.java`
  - `UpperAndLower.java`
  - `FullBody.java`
  - `BroSplit.java`
- `Exercise.java`: Tracks exercise details and performance
- `Muscle.java`: Abstract base class for muscle groups

## Requirements

- Java JDK 8 or later

## Future Enhancements

- Add data persistence to save workouts between sessions
- Implement graphical user interface
- Add progress tracking and visualization
- Include exercise demonstration videos or images
- Add nutrition tracking features

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your improvements.

## License

This project is open-source and available under the MIT License.
