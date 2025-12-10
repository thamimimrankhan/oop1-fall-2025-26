
class Student{
         private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class School {
    private String schName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int number_Of_Students) {
        this.schName = schName;
        this.students = new Student[number_Of_Students]; 
    }
    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more Students to " + schName);
        }
    }
    
    public void showStudents() {
        System.out.println("School: " + schName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + students[i].getName());
        }
    }
}


    class Contact {
    private String phone;
    private String email;

    public Contact(String phone , String email) {
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return phone + ", " + email;
    }
}
class StudentDetails {
    private String name;
    private Contact contact; 

    public StudentDetails(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Contact: " +contact);
    }
}

public class LabTask1 {
     public static void main(String[] args) {

        School s = new School("Aiub", 3); 
        s.addStudent(new Student("Imran"));
        s.addStudent(new Student("Khan"));
        s.addStudent(new Student("Thamim"));

        s.showStudents();
        System.out.println();
        Contact addr = new Contact ("01317709035", "imran@gmail.com");
        StudentDetails c = new StudentDetails("Imran", addr);

        c.showStudentInfo();

}
}
