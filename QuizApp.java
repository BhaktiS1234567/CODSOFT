import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz questions, options, and correct answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?"
        };

        String[][] options = {
            {"A. London", "B. Paris", "C. Rome", "D. Madrid"},
            {"A. Jupiter", "B. Mars", "C. Venus", "D. Saturn"},
            {"A. William Shakespeare", "B. Jane Austen", "C. Charles Dickens", "D. Mark Twain"}
        };

        int[] correctAnswers = {1, 2, 1}; // Index of correct option (starting from 1)

        // Timer (in seconds) for each question
        int[] questionTimer = {10, 15, 20};

        // User's score
        int score = 0;

        // Display questions and collect answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your choice (A/B/C/D): ");
            String userChoice = scanner.next().toUpperCase();

            // Check if the answer is correct within the given time
            long startTime = System.currentTimeMillis();
            while ((System.currentTimeMillis() - startTime) / 1000 < questionTimer[i]) {
                if (userChoice.equals("A") || userChoice.equals("B") || userChoice.equals("C") || userChoice.equals("D")) {
                    if (userChoice.charAt(0) - 'A' + 1 == correctAnswers[i]) {
                        System.out.println("Correct answer!");
                        score++;
                    } else {
                        System.out.println("Incorrect answer!");
                    }
                    break;
                } else {
                    System.out.println("Invalid choice. Enter A/B/C/D: ");
                    userChoice = scanner.next().toUpperCase();
                }
            }
        }

        // Display final score and summary
        System.out.println("\nQuiz completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);
        scanner.close();
    }
}

