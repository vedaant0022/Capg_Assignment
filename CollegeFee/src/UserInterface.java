import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student name");
        String name = sc.nextLine();

        System.out.println("Enter Department name");
        String dept = sc.nextLine();

        System.out.println("Enter gender");
        String gender = sc.nextLine();

        System.out.println("Enter category");
        String category = sc.nextLine();

        System.out.println("Enter College fee");
        double fee = sc.nextDouble();

        Student student;

        if (category.equals("DayScholar")) {

            System.out.println("Enter Bus number");
            int busNo = sc.nextInt();

            System.out.println("Enter the distance");
            float distance = sc.nextFloat();

            student = new DayScholar(id, name, dept, gender, category,
                    fee, busNo, distance);

        } else if (category.equals("Hosteller")) {

            System.out.println("Enter the room number");
            int roomNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Block name");
            char block = sc.nextLine().charAt(0);

            System.out.println("Enter the room type");
            String roomType = sc.nextLine();

            student = new Hosteller(id, name, dept, gender, category,
                    fee, roomNo, block, roomType);

        } else {
            sc.close();
            return;
        }

        double totalFee = student.calculateTotalFee();
        System.out.println("Total College fee is " + totalFee);

        sc.close();
    }
}
