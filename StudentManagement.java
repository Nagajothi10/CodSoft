import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private int rollNo;
    private String name;
    private int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    int getRollNo() {
        return rollNo;
    }
    String getName() {
        return name;
    }
    int getMarks() {
        return marks;
    }
}
public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    students.add(new Student(roll, name, marks));
                    System.out.println("Student added successfully");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found");
                    } 
                    else {
                        System.out.println("\nStudent Details:");
                        for (Student s : students) {
                            System.out.println(
                                "Roll No: " + s.getRollNo() +
                                ", Name: " + s.getName() +
                                ", Marks: " + s.getMarks()
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Student Found:");
                            System.out.println(
                                "Roll No: " + s.getRollNo() +
                                ", Name: " + s.getName() +
                                ", Marks: " + s.getMarks()
                            );
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using Student Management System");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
