public class EntryUtility {

    // Validate Employee ID
    public static boolean validateEmployeeId(String employeeId) throws InvalidEntryException {

        if (employeeId == null || employeeId.length() != 10) {
            throw new InvalidEntryException("Invalid Employee ID");
        }

        if (!employeeId.substring(0, 5).equals("GOAIR")) {
            throw new InvalidEntryException("Invalid Employee ID");
        }

        if (employeeId.charAt(5) != '/') {
            throw new InvalidEntryException("Invalid Employee ID");
        }

        String digits = employeeId.substring(6, 10);
        if (!digits.matches("\\d{4}")) {
            throw new InvalidEntryException("Invalid Employee ID");
        }

        return true;
    }

    // Validate Duration
    public static boolean validateDuration(int duration) throws InvalidEntryException {

        if (duration < 1 || duration > 5) {
            throw new InvalidEntryException("Invalid Duration");
        }

        return true;
    }
}
