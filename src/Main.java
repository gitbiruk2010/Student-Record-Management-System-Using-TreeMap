/**
 * Main class to demonstrate student record management system
 */
public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        // Normal test cases
        System.out.println("=== Normal Test Cases ===");
        // Add students
        manager.addStudent(102, "Israel Benson", 3.8);
        manager.addStudent(101, "Bob Mayor", 2.9);
        manager.addStudent(105, "Megan Brown", 3.5);
        manager.addStudent(103, "Alice Prince", 3.2);
        manager.addStudent(104, "Todd Wright", 4.0);

        // Display sorted records
        manager.displayAllRecords();

        // Update GPA
        System.out.println("\nUpdating Megan's GPA...");
        manager.updateGpa(105, 2.0);

        // Delete record
        System.out.println("\nDeleting Todd's record...");
        manager.deleteStudent(104);

        // Display updated records
        manager.displayAllRecords();

        // Find high GPA students
        manager.findStudentsWithGPA(3.0);
        // -----------------------------------------------------
        // Edge test cases
        System.out.println("\n\n=== Edge Test Cases ===");
        // 1. Add existing ID
        System.out.println("\nAdding existing ID (102):");
        manager.addStudent(102, "New Student", 1.0);

        // 2. Delete non-existent ID
        System.out.println("\nDeleting non-existent ID (106):");
        manager.deleteStudent(106);

        // 3. Update non-existent ID
        System.out.println("\nUpdating non-existent ID (106):");
        manager.updateGpa(106, 4.0);
    }
}