package SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        int sum = 0;
        while (number != 0 ) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр " + sum);
    }

}
