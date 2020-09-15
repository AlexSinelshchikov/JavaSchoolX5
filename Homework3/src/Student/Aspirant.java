package Student;

public class Aspirant extends Student {

    public String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public void getScholarship() {

        if (averageMark >= 5) {
            sumScholarship = 200;
        } else sumScholarship = 180;

        System.out.println("Аспирант." + " " + "Стипендия: " + sumScholarship);
    }
}
