# Workout Split App

![Fitness Icon](https://img.icons8.com/color/96/000000/fitness.png) by [Icons8](https://icons8.com)

A comprehensive Java application for creating, managing, and tracking detailed workout routines with exercise-specific tracking.

## Features

### Workout Splits
- 🏋️‍♂️ Multiple split options:
  - Push-Pull-Legs (PPL)
  - Arnold Split
  - Upper-Lower
  - Full Body
  - Bro Split

### Muscle Group Targeting
- **Chest**: 
  - Upper (Incline Presses)
  - Inner (Squeeze Movements)
  - Lower (Decline/Dips)
- **Back**:
  - Upper Back (Rows)
  - Lats (Pulldowns)
- **Shoulders**:
  - Front Head (Presses)
  - Lateral Head (Raises)  
  - Rear Head (Flys)
- **Arms**:
  - Biceps (Curls)
  - Triceps (Extensions)
- **Legs**:
  - Quadriceps (Squats)
  - Hamstrings (Deadlifts)
  - Adductors
  - Calves

### Tracking
- 📊 Log sets, reps, and weights
- ⏱ Built-in rest timer
- ✏️ Edit existing workouts

## Class Structure

### Core Classes
- `SplitApp.java` - Main application
- `ControlSplits.java` - Manages workout logic
- `Split.java` - Abstract split class
- `Exercise.java` - Exercise tracking

### Split Implementations
- `PushPullLeg.java`
- `ArnoldSplit.java` 
- `UpperAndLower.java`
- `FullBody.java`
- `BroSplit.java`

### Muscle Groups
- `Chest.java` (Upper/Inner/Lower)
- `Back.java` (Upper/Lats)  
- `Shoulders.java` (Front/Lateral/Rear)
- `Arms.java` (Biceps/Triceps)
- `Leg.java` (Quads/Hams/Adductors/Calves)

## Usage
1. Compile and run `SplitApp.java`
2. Follow menu prompts to:
   - Create workouts
   - Track exercises
   - Manage progress

## Requirements
- Java JDK 8+

## Future Enhancements
- Workout history tracking
- Graphical interface
- Exercise demonstrations
