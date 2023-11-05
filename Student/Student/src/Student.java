public class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return String.format("Student: id: %d, name: %s, cgpa: %.2f", id, name, cgpa);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Peter", 4.05);
        System.out.println(student);

        student.setCGPA(3.6);
        System.out.println(student);
    }
}
