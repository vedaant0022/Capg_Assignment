import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Exam Details:");
        System.out.println("Student Name:");
        String studentName = sc.nextLine();

        System.out.println("Question Type (MCQ/Coding):");
        String questionType = sc.nextLine();

        System.out.println("Total Questions:");
        int totalQuestions = sc.nextInt();

        System.out.println("Correct Answers:");
        int correctAnswers = sc.nextInt();

        System.out.println("Wrong Answers:");
        int wrongAnswers = sc.nextInt();

        // ✅ Constructor call matches expected order
        OnlineTest test = new OnlineTest(
                studentName,
                totalQuestions,
                correctAnswers,
                wrongAnswers,
                questionType
        );

        double percentage = test.calculateScore();
        String result = Exam.evaluateResult(percentage);

        System.out.println("\nExam Summary:");
        System.out.println(
                questionType + " Test: " + studentName
                + ", Total Score: " + String.format("%.1f", percentage)
                + ", Result: " + result
        );

        sc.close();
    }
}
