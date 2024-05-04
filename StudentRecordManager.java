import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer, Student> studentRecords;

    public StudentRecordManager() {
        studentRecords = new TreeMap<>();
    }

    public void addStudent(int studentId, String name, double gpa) {
        if (!studentRecords.containsKey(studentId)) {
            studentRecords.put(studentId, new Student(studentId, name, gpa));
        } else {
            System.out.println("Student ID already exists. Record not added.");
        }
    }

    public void deleteStudent(int studentId) {
        if (studentRecords.remove(studentId) == null) {
            System.out.println("Student ID not found. No record deleted.");
        }
    }

    public void updateGPA(int studentId, double newGPA) {
        Student student = studentRecords.get(studentId);
        if (student != null) {
            student.setGPA(newGPA);
        } else {
            System.out.println("Student ID not found. Not updated.");
        }
    }

    public void displayAllRecords() {
        for (Student student : studentRecords.values()) {
            System.out.println(student);
        }
    }

    public void displayHighGPA(double minGPA) {
        for (Student student : studentRecords.values()) {
            if (student.getGPA() > minGPA) {
                System.out.println(student);
            }
        }
    }
}

