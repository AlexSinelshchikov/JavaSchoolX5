package SixthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixthTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите целое число");
        int number = Integer.parseInt(reader.readLine());

        System.out.println(getParityNumber(number) + "." + " " + getPositiveNegativeNumber(number));
    }

    public static String getParityNumber(int number) {

        String parity;

        if (number == 0) {
            parity = "Значение является нулевым числом";
        } else if (number % 2 == 0) {
            parity = "Четное число";
        } else
            parity = "Нечетное число";
        return parity;

    }

    public static String getPositiveNegativeNumber(int number) {

        String positiveNegative;

        if (number == 0) {
            positiveNegative = "";
        } else if (number > 0) {
            positiveNegative = "Положительное число.";
        } else positiveNegative = "Отрицательное число.";

        return positiveNegative;
    }
}
