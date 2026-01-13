import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for the first array");
        int size1 = sc.nextInt();

        if (size1 <= 0) {
            System.out.println(size1 + " is an invalid array size");
            return;
        }

        int[] arr1 = new int[size1];
        System.out.println("Enter the elements for the first array");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size for the second array");
        int size2 = sc.nextInt();

        if (size2 <= 0) {
            System.out.println(size2 + " is an invalid array size");
            return;
        }

        int[] arr2 = new int[size2];
        System.out.println("Enter the elements for the second array");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (size1 != size2) {
            System.out.println("Both array size are not the same");
            return;
        }

        int[] arr3 = new int[size1];

        for (int i = 0; i < size1; i++) {
            if (i % 2 == 0) {
                arr3[i] = arr1[i] + arr2[i];
            } else {
                arr3[i] = arr1[i] - arr2[i];
            }
        }

        System.out.println("The elements of the third array");
        for (int i = 0; i < size1; i++) {
            System.out.println(arr3[i]);
        }

        sc.close();
    }
}
