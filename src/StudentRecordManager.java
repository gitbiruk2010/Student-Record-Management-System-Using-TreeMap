import java.util.Map;
import java.util.TreeMap;

// to manage the records using treemap for a normal ordering by id
public class StudentRecordManager {
    // TreeMap to store student records with ID as key
    private final TreeMap<Integer, Student> records;

    public StudentRecordManager() {
        this.records = new TreeMap<>();
    }

    // to add new student to the system
    public boolean addStudent(int id, String name, double gpa) {
        if (records.containsKey(id)) {
            System.out.println("Student ID " + id + " already exists!");
            return false;
        }
        records.put(id, new Student(id, name, gpa));
        return true;
    }

    // to remove a student from the record using id
    public boolean deleteStudent(int id) {
        if (records.remove(id) == null) {
            System.out.println("Student ID " + id + " not found!");
            return false;
        }
        return true;
    }

    // to update gpa for existing student
    public boolean updateGpa(int id, double newGpa) {
        Student student = records.get(id);
        if (student == null) {
            System.out.println("Student ID " + id + " not found!");
            return false;
        }
        student.setGpa(newGpa);
        return true;
    }

    // to display all record sorted by id
    public void displayAllRecords() {
        System.out.println("\nAll Student Records (Sorted by ID):");
        System.out.println("-----------------------------------");
        for (Map.Entry<Integer, Student> entry : records.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // parameter minGpa to find student with minimum gpa threshold
    public void findStudentsWithGPA(double minGpa) {
        System.out.printf("\nStudents with GPA above %.1f:\n", minGpa);
        System.out.println("-----------------------------");
        for (Student student : records.values()) {
            if (student.getGpa() > minGpa) {
                System.out.println(student);
            }
        }
    }
}