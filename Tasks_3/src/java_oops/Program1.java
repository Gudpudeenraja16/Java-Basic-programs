import java.util.Scanner;

public class Program1 {
    String name;
    String rollno;
    String course;
    double marks;

    public void Student(String name, String rollno, String course, double marks)
    {
        this.name = name;
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;

    }
    public void Display()
    {
        System.out.printf("%-15s: %s%n", "Name", name);
        System.out.printf("%-15s: %s%n", "Roll No", rollno);
        System.out.printf("%-15s: %s%n", "Course", course);
        System.out.printf("%-15s: %s%n", "CGPA", marks);
    }
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the Student Name: ");
            String name = Sc.nextLine();
            System.out.println("Enter the Roll Number: ");
            String rollno = Sc.nextLine();
            System.out.println("Enter Course: ");
            String course = Sc.nextLine();
            System.out.println("Enter CGPA: ");
            double marks = Sc.nextDouble();
            Program1 p1 = new Program1();
            p1.Student(name,rollno,course,marks);
            p1.Display();
        }
    }
}
