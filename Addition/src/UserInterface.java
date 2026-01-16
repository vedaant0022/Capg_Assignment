public class UserInterface {

    // Varargs method
    public static int addition(int... a) {

        System.out.println("Number of arguments is " + a.length);

        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        int result;

        // Call with 2 arguments
        result = addition(10, 15);
        System.out.println("Total " + result);

        // Call with 3 arguments
        result = addition(10, 20, 30);
        System.out.println("Total " + result);

        // Call with 6 arguments
        result = addition(10, 20, 30, 40, 50, 70);
        System.out.println("Total " + result);
    }
}
