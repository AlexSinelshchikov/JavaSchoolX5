package Computer;

import Computer.Facade.FacadeComputer;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String oneCase = "WORK";
        String twoCase = "GAME";

        FacadeComputer facadeComputer = new FacadeComputer();
        Computer computer = new Computer();

        PurposeOfComputer purposeOfComputer = PurposeOfComputer.valueOf(oneCase);
        facadeComputer.findOutDestination(computer, purposeOfComputer );
        System.out.println(computer);

        PurposeOfComputer purposeOfComputerTwo = PurposeOfComputer.valueOf(twoCase);
        facadeComputer.findOutDestination(computer, purposeOfComputerTwo );
        System.out.println(computer);
    }
}
