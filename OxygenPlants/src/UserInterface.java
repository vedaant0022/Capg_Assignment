import java.util.Scanner;

public class UserInterface {

    static int totalPlant(double len, double bre, double area) {
        double plants = (len * bre / area) * 100 * 100;
        int totalPlants = (int) plants;
        return (totalPlants / 10) * 10;
    }

    static double totalOxygen(int plant) {
        return plant * 0.9;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the room(in m)");
        double length = sc.nextDouble();
        if (length <= 0) {
            System.out.println("Invalid length");
            return;
        }

        System.out.println("Enter the breadth of the room(in m)");
        double breadth = sc.nextDouble();
        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            return;
        }

        System.out.println("Enter the plant area of a single plant(in cm2)");
        double area = sc.nextDouble();
        if (area <= 0) {
            System.out.println("Invalid plant area");
            return;
        }

        int plants = totalPlant(length, breadth, area);
        double oxygen = totalOxygen(plants);

        System.out.println("Total number of plants is " + plants);
        System.out.printf("Total oxygen production is %.2f litres", oxygen);

        sc.close();
    }
}
