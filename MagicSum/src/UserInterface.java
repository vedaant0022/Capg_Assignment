import java.util.Scanner;

public class UserInterface {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isSumOfConsecutivePrimes(int num) {
        int sum = 0;
        int p = 2;

        while (sum < num) {
            if (isPrime(p)) {
                sum += p;
            }
            p++;
        }
        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (size < 1 || size > 5) {
            System.out.println(size + " is an invalid array size");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the numbers");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0 || arr[i] >= 100) {
                System.out.println(arr[i] + " is an invalid input");
                return;
            }
        }

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i]) && isSumOfConsecutivePrimes(arr[i])) {

                if (!found) {  
                    System.out.println("The sum of prime numbers is");
                    found = true;
                }

                System.out.println(arr[i]);
            }
        }

        if (!found) {
            System.out.println("The " + size + " numbers are not sum of prime numbers");
        }

        sc.close();
    }
}
