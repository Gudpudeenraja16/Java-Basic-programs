interface Student {
    String getName();
    int getAge();
    String getMajor();
    void setName(String name);
    void setAge(int age);
    void setMajor(String major);
}

public class Program18 implements Student {
    private String name;
    private int age;
    private String major;

    public Program18(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setMajor(String major) {
        this.major = major;
    }

   public static void main(String[] args) {
        Program18 student = new Program18("Gudpudeen raja", 22, "Computer Science");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
    }
}