import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to store total marks
        double totalMarks = 0;

        // Loop to get marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();

            // Validate input (should be between 0 and 100)
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
                marks = scanner.nextDouble();
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / numSubjects;

        // Determine the grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}