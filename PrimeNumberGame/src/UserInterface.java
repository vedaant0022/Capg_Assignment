import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array");
        int n1 = sc.nextInt();

        if (n1 <= 0) {
            System.out.println(n1 + " is an invalid array size");
            return;
        }

        int arr1[] = new int[n1];
        System.out.println("Enter the array elements");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] < 0) {
                System.out.println(arr1[i] + " is an invalid input");
                return;
            }
        }

        System.out.println("Enter the size of second array");
        int n2 = sc.nextInt();

        if (n2 <= 0) {
            System.out.println(n2 + " is an invalid array size");
            return;
        }

        if (n1 != n2) {
            System.out.println("Both array size is different");
            return;
        }

        int arr2[] = new int[n2];
        System.out.println("Enter the array elements");

        for (int i = 0; i < n2; i++) {   // ✅ FIXED
            arr2[i] = sc.nextInt();
            if (arr2[i] < 0) {
                System.out.println(arr2[i] + " is an invalid input");
                return;
            }
        }

        int sumArray[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }

        int sumDigits = 0;
        for (int i = 0; i < n1; i++) {
            sumDigits += sumArray[i] % 10;
        }

        boolean isPrime = true;
        if (sumDigits <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(sumDigits); i++) {
                if (sumDigits % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(sumDigits + " is a prime number");
        } else {
            System.out.println(sumDigits + " is not a prime number");
        }

        sc.close();
    }
}
