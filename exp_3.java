import java.util.Scanner;
public class exp_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter student Age: ");
        int studentAge = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

       
        System.out.println("\n--- Student Admission Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
        System.out.println("Age: " + studentAge);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}