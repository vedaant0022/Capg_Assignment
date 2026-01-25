public class OnlineTest implements Exam {

    private String studentName;
    private int totalQuestions;
    private int correctAnswers;
    private int wrongAnswers;
    private String questionType;

    // ✅ REQUIRED constructor order
    public OnlineTest(String studentName,
                      int totalQuestions,
                      int correctAnswers,
                      int wrongAnswers,
                      String questionType) {

        this.studentName = studentName;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
        this.questionType = questionType;
    }

    @Override
    public double calculateScore() {

        double marksPerQuestion;

        // Case-sensitive as required
        if (questionType.equals("MCQ")) {
            marksPerQuestion = 2;
        } else { // Coding
            marksPerQuestion = 5;
        }

        double totalScore =
                (correctAnswers * marksPerQuestion)
              - (wrongAnswers * (marksPerQuestion * 0.10));

        double percentage =
                (totalScore / (totalQuestions * marksPerQuestion)) * 100;

        // One decimal place
        return Math.round(percentage * 10.0) / 10.0;
    }
}
