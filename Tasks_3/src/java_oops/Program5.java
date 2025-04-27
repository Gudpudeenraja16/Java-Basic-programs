public class Program5 {

    class Employee {
        
        private String name;
        private int id;
        private double salary;

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
    }

    class TeachingEmployee extends Employee {
        
        private String subject;

        public TeachingEmployee(String name, int id, double salary, String subject) {
            super(name, id, salary);
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Subject: " + subject);
        }
    }

    class NonTeachingEmployee extends Employee {
        private String department;

        public NonTeachingEmployee(String name, int id, double salary, String department) {
            super(name, id, salary);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        
        Program5 P5 = new Program5();

        TeachingEmployee teacher = P5.new TeachingEmployee("Elon Musk", 101, 50000, "Computer Science");
        NonTeachingEmployee admin = P5.new NonTeachingEmployee("Bill Gates", 201, 40000, "IT");

        System.out.println("Teaching Employee Details:");
        teacher.displayDetails();

        System.out.println(); // New line for separation

        System.out.println("Non-Teaching Employee Details:");
        admin.displayDetails();
    }
}
