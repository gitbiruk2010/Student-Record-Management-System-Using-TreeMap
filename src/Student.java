//Student class
public class Student {
    private int id;
    private String name;
    private double gpa;

    // Here we have constructors to create a student object using id, name, and Gpa
    public Student(int id, String name, double GPA) {
        this.id = id;
        this.name = name;
        this.gpa = GPA;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-15s | GPA: %.2f", id, name, gpa);
    }
}