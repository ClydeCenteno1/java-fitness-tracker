# 🏋️ Java Fitness Tracker

A console-based fitness tracker built in Java that collects user profile data, calculates BMI, categorizes weight, and logs workouts with estimated calories burned.

---

## 📋 Features

- **User Profile Input** — Collects name, age, height, weight, and student status
- **BMI Calculator** — Computes Body Mass Index using the standard formula
- **BMI Classification** — Categorizes results across 6 weight ranges with a special student athlete message
- **Workout Logger** — Log multiple workouts in a single session via a do-while loop
- **Input Validation** — Enforces intensity range (1–10) with retry tracking
- **Calorie Estimation** — Estimates calories burned based on duration and intensity
- **String Processing** — Formats exercise names (trim, uppercase, underscore-separated)

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (IntelliJ IDEA recommended) or a terminal

### Running the Project

**Via IntelliJ IDEA:**
1. Clone the repository
   ```bash
   git clone https://github.com/ClydeCenteno1/java-fitness-tracker.git
   ```
2. Open the project in IntelliJ IDEA
3. Navigate to `src/fitnessTracker.java`
4. Click **Run** or press `Shift + F10`

**Via Terminal:**
```bash
cd java-fitness-tracker/src
javac fitnessTracker.java
java fitnessTracker
```

---

## 🖥️ Sample Output

```
Input is your name: Clyde
Input is your age: 20
Input is your height (in cm): 175
Input is your weight: 68
Are you a student (true/false): true

Your BMI is: 22.20
You are a student athlete!
Normal Weight

Log a workout? (yes/no): yes
Enter exercise name: push ups
Enter duration (in minutes): 30
Intensity (1-10): 8
It took you 0 tries
Calories Burned: 12.0 calories
Exercise name: PUSH_UPS
length: 9
First word: PUSH

Log workout again? (yes/no): no
```

---

## 📐 BMI Categories

| BMI Range       | Classification      |
|-----------------|---------------------|
| Below 18.5      | Underweight         |
| 18.5 – 24.9     | Normal Weight       |
| 18.5 – 24.9 *(student)* | Student Athlete 🏅 |
| 25.0 – 29.9     | Overweight          |
| 30.0 – 34.9     | Obesity Class I     |
| 35.0 – 39.9     | Obesity Class II    |
| 40.0 and above  | Obesity Class III   |

---

## 🔢 Calorie Formula

```
Calories Burned = Duration (min) × Intensity (1–10) × 0.05
```

---

## 📁 Project Structure

```
java-fitness-tracker/
├── src/
│   └── fitnessTracker.java   # Main application file
├── .idea/                    # IntelliJ project config
├── gymProject.iml            # Module file
├── .gitignore
└── README.md
```

---

## 🛠️ Built With

- **Java** — Core language
- **java.util.Scanner** — Console input handling
- **java.lang.Math** — BMI calculation (`Math.pow`)

---

## 👤 Author

**Clyde Centeno**
- GitHub: [@ClydeCenteno1](https://github.com/ClydeCenteno1)

---

## 📄 License

This project is open source and available for educational use.
