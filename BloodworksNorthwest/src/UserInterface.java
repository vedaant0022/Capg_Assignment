import java.util.Scanner;

public class UserInterface 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter the age");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the gender");
        String gender = sc.nextLine();

        System.out.println("Enter the blood group");
        String bloodGroup = sc.nextLine();

        System.out.println("Enter the phone no");
        long phone = sc.nextLong();

        DonorDetails donor = new DonorDetails(name, age, gender, bloodGroup, phone);

        System.out.println("Name:" + donor.getName());
        System.out.println("Age:" + donor.getAge());
        System.out.println("Gender:" + donor.getGender());
        System.out.println("Blood group:" + donor.getBloodGroup());
        System.out.println("Phone no:" + donor.getPhoneNumber());

        sc.close();
    }
}
