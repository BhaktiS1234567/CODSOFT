import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter marks for each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numSubjects = 0;
        double totalMarks = 0;

        while (true) {
            System.out.print("Enter marks for subject " + (numSubjects + 1) + " (or enter -1 to finish): ");
            int marks = scanner.nextInt();

            if (marks == -1) {
                break;
            }

            totalMarks += marks;
            numSubjects++;
        }

        // Calculate total marks and average percentage
        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;

        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

