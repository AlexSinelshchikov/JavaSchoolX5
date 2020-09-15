package TenthTask;

public class TenthTask {
    public static void main(String[] args) {

        int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int a = array.length;
        movingZerosToEndOfArray(array, a);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void movingZerosToEndOfArray(int[] array, int a) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < a) {
            array[count++] = 0;
        }
    }
}
