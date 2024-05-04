public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();
        
        manager.addStudent(101, "Cynthia", 3.5);
        manager.addStudent(102, "Avery", 2.8);
        manager.addStudent(103, "Balthazar", 3.9);
        manager.addStudent(104, "Kamali", 3.2);
        manager.addStudent(105, "Eva", 4.0);

        System.out.println("All Records:");
        manager.displayAllRecords();

        manager.updateGPA(103, 4.1);

        System.out.println("Updated List:");
        manager.displayAllRecords();

        manager.deleteStudent(102);

        System.out.println("Remaining Records:");
        manager.displayAllRecords();

        System.out.println("Students with GPA higher than 3.0:");
        manager.displayHighGPA(3.0);
    }
}

