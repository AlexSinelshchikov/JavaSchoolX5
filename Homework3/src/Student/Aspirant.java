package Student;

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public void getScholarship() {

        if (getAverageMark() >= 5) {
            sumScholarship = 200;
        }
        else {
            sumScholarship = 180;
        }

        System.out.println("Аспирант." + " " + "Стипендия: " + getSumScholarship());
    }
}
