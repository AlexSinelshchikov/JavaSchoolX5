package SeventhTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeventhTask {

    public static void main(String[] args) throws IOException {

        int costTenMinuteConversation = 10;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите код города");
        int areaCode = Integer.parseInt(reader.readLine());

        System.out.println("Стоимость десяти минут разговора с абонентом составит: " + getCity(areaCode) * costTenMinuteConversation);
    }

    public static double getCity (int areaCode) {

        double cityMoscow = 4.15;
        double cityRostov = 1.98;
        double cityKrasnodar = 2.69;
        double cityKirov = 5.00;

        switch (areaCode) {
            case 905:
                return cityMoscow;
            case 194:
                return cityRostov;
            case 491:
                return cityKrasnodar;
            case 800:
                return cityKirov;
            default:
                return 0;
        }
    }
}
