import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private static Map<String, Double> employeeMap = new HashMap<>();

    public static Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public static void setEmployeeMap(Map<String, Double> employeeMap) {
        UserInterface.employeeMap = employeeMap;
    }

    public void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }

    public static EmployeeAudit findEmployee() {

        return (salary) -> {
            ArrayList<String> result = new ArrayList<>();

            for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
                if (entry.getValue() <= salary) {
                    result.add(entry.getKey());
                }
            }
            return result;
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserInterface ui = new UserInterface();

        while (true) {

            System.out.println("1.Add Employee Details");
            System.out.println("2.Find Employee Details");
            System.out.println("3.Exit");
            System.out.println("Enter the choice");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("Enter the Employee name");
                String name = sc.nextLine();

                System.out.println("Enter the Employee Salary");
                double salary = sc.nextDouble();

                ui.addEmployeeDetails(name, salary);

            } else if (choice == 2) {

                System.out.println("Enter the salary to be searched");
                double searchSalary = sc.nextDouble();

                EmployeeAudit audit = UserInterface.findEmployee();
                ArrayList<String> employees =
                        audit.fetchEmployeeDetails(searchSalary);

                if (employees.isEmpty()) {
                    System.out.println("No Employee Found");
                } else {
                    System.out.println("Employee List");
                    for (String emp : employees) {
                        System.out.println(emp);
                    }
                }

            } else if (choice == 3) {

                System.out.println("Let's complete the session");
                break;
            }
        }

        sc.close();
    }
}
