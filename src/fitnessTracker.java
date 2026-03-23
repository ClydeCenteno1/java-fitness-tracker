import java.util.Scanner;

public class fitnessTracker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Phase 1

        String name = "";
        int age;
        double height;
        double weight;
        boolean isStudent;
        final int caloriesPerKg = 7700;

        //User Inputs
        System.out.print("Input is your name: ");
        name = scanner.nextLine();

        System.out.print("Input is your age: ");
        age = scanner.nextInt();

        System.out.print("Input is your height (in cm): ");
        height = scanner.nextDouble();

        System.out.print("Input is your weight: ");
        weight = scanner.nextDouble();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();
        scanner.nextLine();

        // Formula
        double bmi = weight / Math.pow(height/100,2);

        System.out.printf("Your BMI is: %.2f%n",bmi);


        //BMI Categories (Phase 2)
        if(bmi < 18.5){
            System.out.println("You are underweight");
        }
        else if(bmi < 25){
            if (isStudent) {
                System.out.println("You are a student athlete!");
                System.out.println("Normal Weight");
            }
            else {
                System.out.println("Normal Weight");
            }
        }
        else if(bmi < 30) {
            System.out.println("Overweight");
        }
        else if(bmi < 35){
            System.out.println("Obesity class I");
        }
        else if(bmi < 40){
            System.out.println("Obesity class II");
        }
        else{
            System.out.println("Obesity class III");
        }

        //Phase 3

        String again;

        do{
            System.out.println("Log a workout? (yes/no): ");
            String log = scanner.nextLine();

            if(log.equalsIgnoreCase("yes")){

                System.out.print("Enter exercise name: ");
                String exerciseName;
                exerciseName = scanner.nextLine();

                System.out.print("Enter duration (in minutes): ");
                double duration;
                duration = scanner.nextDouble();

                System.out.print("Intensity (1-10): ");
                int intensity;
                intensity = scanner.nextInt();
                scanner.nextLine();
                int attempt = 0;

                while(intensity < 1 || intensity > 10){
                    System.out.println("Input an intensity from 1-10");

                    System.out.println("Intensity (1-10): ");
                    intensity = scanner.nextInt();
                    scanner.nextLine();
                    attempt++;
                }

                System.out.println("It took you "+attempt+" tries");

                //Calories Burned
                double calBurned = duration * intensity * 0.05;
                System.out.println("Calories Burned: "+calBurned+" calories");

                // Phase 4

                exerciseName = exerciseName.trim().toUpperCase();
                int exerciseNameLength = exerciseName.length();
                System.out.println("Exercise name: "+exerciseName);
                System.out.println("length: "+exerciseNameLength);


                String firstWord = exerciseName.substring(0,exerciseName.indexOf(" "));
                System.out.println("First word: "+firstWord);

                exerciseName = exerciseName.replace(" ", "_");
                System.out.println("Exercise name with _: "+exerciseName);
            }

            System.out.print("Log workout again? (yes/no): ");
            again = scanner.nextLine();

        }while(again.equalsIgnoreCase("yes"));

        scanner.close();

    }
}
