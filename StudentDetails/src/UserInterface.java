import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student's address:");
        String address = sc.nextLine();

        Student student = null;

        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                student = new Student(id, name, address);
                break;
            } 
            else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Enter the college name:");
                String college = sc.nextLine();
                student = new Student(id, name, address, college);
                break;
            } 
            else {
                System.out.println("Wrong Input");
            }
        }

        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("College name:" + student.getCollegeName());

        sc.close();
    }
}
