import java.util.Scanner;

public class UserInterface {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");

        int choice = sc.nextInt();
        VolumeCalculator v = new VolumeCalculator();

        switch (choice) {

            case 1:
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                System.out.println("Enter the height");
                double height = sc.nextDouble();

                double cyl = v.calculateVolume(radius, height);
                System.out.printf("Volume of the Cylinder is %.2f", cyl);
                break;

            case 2:
                System.out.println("Enter the length");
                int length = sc.nextInt();
                System.out.println("Enter the breadth");
                int breadth = sc.nextInt();
                System.out.println("Enter the height");
                int height2 = sc.nextInt();

                double cub = v.calculateVolume(length, breadth, height2);
                System.out.printf("Volume of the Cuboid is %.2f", cub);
                break;
        }

        sc.close();
    }
}
