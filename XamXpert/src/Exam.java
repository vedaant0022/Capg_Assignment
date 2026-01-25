public interface Exam {

    public double calculateScore();

    public static String evaluateResult(double percentage) {

        if (percentage >= 85) {
            return "Merit";
        } else if (percentage >= 60 && percentage < 85) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
