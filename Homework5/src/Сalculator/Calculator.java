package Сalculator;

public class Calculator {

    public double firstDigit;
    public double secondDigit;

    public Calculator() {
    }

    public void performSubtraction(double firstDigit, double secondDigit) {
        double resultSubtraction = firstDigit - secondDigit;
        log("Результат вычитания будет равен: " + resultSubtraction);
    }

    public void performAddition(double firstDigit, double secondDigit) {
        double resultAddition = firstDigit + secondDigit;
        log("Результат сложения будет равен: " + resultAddition);
    }

    public void performMultiplication(double firstDigit, double secondDigit) {
        double resultMultiplication = firstDigit * secondDigit;
        log("Результат умножения будет равен: " + resultMultiplication);
    }

    public void performDivision(double firstDigit, double secondDigit) {
        double resultDivision = firstDigit / secondDigit;
        log("Результат деления будет равен: " + resultDivision);
    }

    public void log(String massage) {
        for (LoggerType temp : LoggerType.values()) {
            Logger logger = FactoryLogger.createConfigurator(temp);
            logger.log(massage);
        }
    }
}



