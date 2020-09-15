package EighthTask;

public class EighthTask {
    public static void main(String[] args) {
        int[] list = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        getMaximumValue(list);
        getPositiveSum(list);
        getSumEvenNegative(list);
        getQuantityPositive(list);
        getAverageArithmetic(list);
    }

    public static void getPositiveSum(int[] list) {
        int sum = 0;
        for (int pace : list) {
            if (pace > 0) {
                sum += pace;
            }
        }
        System.out.println("Сумма положительных элементов массива:" + " " + sum);
    }

    public static void getSumEvenNegative(int[] list) {
        int sum = 0;
        for (int tmpInt : list) {
            if (tmpInt % 2 == 0 && tmpInt < 0) {
                sum += tmpInt;
            }
        }
        System.out.println("Сумма четных отрицательных элементов массива:" + " " + sum);
    }

    public static void getQuantityPositive(int[] list) {
        int sumQuantity = 0;
        for (int quantity : list) {
            if (quantity > 0) {
                sumQuantity++;
            }
        }
        System.out.println("Количество положительных элементов массива:" + " " + sumQuantity);
    }

    public static void getAverageArithmetic(int[] list) {
        double sumNumber = 0;
        double sumAll = 0;
        for (int temp : list) {
            if (temp < 0) {
                sumAll += temp;
                sumNumber++;
            }
        }
        double arithmetic = sumAll / sumNumber;
        System.out.println("Среднее арифметическое отрицательных элементов:" + " " + arithmetic);
    }

    public static void getMaximumValue(int[] list) {
        int maximum = list[0];
        for (int i = 1; i < list.length; i++) {
            maximum = Math.max(maximum, list[i]);
        }
        System.out.println("Максимальное значение:" + " " + maximum);
    }
}

