package Student;

public class Main {
    public static void main(String[] args) {
        Student aspirant = new Aspirant("Иванов", "Сергей", "Экономка", 4.7, "Управление эффективностью бизнеса");
        Student student = new Student("Сидоров", "Николай", "Информатика", 5);

        Student[] studentsAspirant = new Student[] {aspirant, student} ;

        for (int i = 0; i < studentsAspirant.length; i++) {
            studentsAspirant[i].getScholarship();
        }
    }
}
