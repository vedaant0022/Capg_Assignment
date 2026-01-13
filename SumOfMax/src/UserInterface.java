import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println(size + " is an invalid array size");
            return;
        }

        if (size % 2 != 0) {
            System.out.println(size + " is an odd number.Please enter even number");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter the number");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sumMax = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length - 1;   

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > sumMax) {
                sumMax = sum;
            }
            left++;
            right--;
        }

        System.out.println("The maximum number is " + sumMax);

        sc.close();
    }
}
