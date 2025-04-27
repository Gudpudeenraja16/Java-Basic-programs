interface RegularStudent {
    String getName();
    int getAge();
    String getMajor();
    void setName(String name);
    void setAge(int age);
    void setMajor(String major);
}

interface SportsStudent {
    String getSport();
    void setSport(String sport);
}

public class Program19 implements RegularStudent {
    private String name;
    private int age;
    private String major;

    public Program19(String name, int age, String major) {
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
}

class SportsStudentImpl extends Program19 implements SportsStudent {
    private String sport;

    public SportsStudentImpl(String name, int age, String major, String sport) {
        super(name, age, major);
        this.sport = sport;
    }

    @Override
    public String getSport() {
        return sport;
    }

    @Override
    public void setSport(String sport) {
        this.sport = sport;
    }


    public static void main(String[] args) {
        Program19 regularStudent = new Program19("Gudpudeen Raja", 22, "Java");
        System.out.println("Name: " + regularStudent.getName());
        System.out.println("Age: " + regularStudent.getAge());
        System.out.println("Major: " + regularStudent.getMajor());

        SportsStudentImpl sportsStudent = new SportsStudentImpl("Balaji", 21, "Python", "Cricket");
        System.out.println("Name: " + sportsStudent.getName());
        System.out.println("Age: " + sportsStudent.getAge());
        System.out.println("Major: " + sportsStudent.getMajor());
        System.out.println("Sport: " + sportsStudent.getSport());
    }
}