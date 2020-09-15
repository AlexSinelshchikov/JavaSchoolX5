package Student;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;
    public int sumScholarship;

    public Student (String firstName, String lastName, String group, double averageMark ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship () {

        if (averageMark >= 5) {
            sumScholarship = 100;
        }
        else sumScholarship = 80;

        System.out.println("Студент." + " " + "Стипендия: " + sumScholarship);
    }
}