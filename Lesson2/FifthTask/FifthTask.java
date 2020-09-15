package FifthTask;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        int[] specifiedNumber = new int[3];
        int temp = 0;

        for (int ignored : specifiedNumber) {
            specifiedNumber[temp] = input.nextInt();
            temp++;
        }

        System.out.println(getMinimum(specifiedNumber));
    }

    public static int getMinimum(int[] specifiedNumber) {

        int minimum = specifiedNumber[0];

        for (var value : specifiedNumber) {
            if (minimum > value) {
                minimum = value;
            }
        }

        return minimum;
    }
}
