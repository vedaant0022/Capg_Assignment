import java.util.ArrayList;

@FunctionalInterface
public interface EmployeeAudit {
    public ArrayList<String> fetchEmployeeDetails(double salary);
}
