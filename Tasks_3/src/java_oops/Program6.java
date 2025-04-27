public class Program6 {

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
            
            Program6 P6 = new Program6();
            
         // Creating an array of Employee type to hold both Teaching and Non-Teaching employees
            
            Employee[] emp = new Employee[4];
    
        //Adding TeachingEmployees Details
            emp[0] = P6.new TeachingEmployee("James Gosling", 101, 50000.65, "JAVA");
            emp[1] = P6.new TeachingEmployee("Guido Van Rossum", 102, 55000, "Python");
    
        //Adding NonTeachingEmployees Details 
            emp[2] = P6.new NonTeachingEmployee("Sundhar Pichai", 201, 40000.50, "IT");
            emp[3] = P6.new NonTeachingEmployee("Mukesh Ambani", 202, 42000, "Telcom");
    
        // Displaying details of all employees in the array
            System.out.println("Company Employee Details:");
            for (Employee e : emp) {
                e.displayDetails();
                System.out.println(); // New line for separation
            }
        }
    }
    

