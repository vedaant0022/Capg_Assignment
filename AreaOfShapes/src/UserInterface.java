import java.util.Scanner;

public class UserInterface {
    static void circle(double r) {
        double area = 3.14 * r * r;
        System.out.printf("Area of the Circle is %.2f", area);
    }

    static void triangle(double base, double height) {
        double area = (base * height) / 2.0;
        System.out.printf("Area of the Triangle is %.2f", area);
    }

    static void square(double side) {
        double area = side * side;
        System.out.printf("Area of the Square is %.2f", area);
    }

    static void rectangle(double length, double breadth) {
        double area = length * breadth;
        System.out.printf("Area of the Rectangle is %.2f", area);
    }
	

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides");
        int sides = sc.nextInt();

        switch (sides) {

            case 0:
                System.out.println("Enter the radius");
                double r = sc.nextDouble();
                circle(r);
                break;

            case 3:
                System.out.println("Enter the base and height");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                triangle(base, height);
                break;

            case 4:
                System.out.println("Enter the length");
                double length = sc.nextDouble();
                System.out.println("Enter the breadth");
                double breadth = sc.nextDouble();

                if (length == breadth) {
                    square(length);
                } else {
                    rectangle(length, breadth);
                }
                break;

            default:
                System.out.println("Invalid side");
        }

        sc.close();
    }

}
