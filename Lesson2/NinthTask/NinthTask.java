package NinthTask;

public class NinthTask {
    public static void main(String[] args) {

        int[] list = new int[] {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 5, 6, -12, 24, -52};
        realizeReverse(list);
    }

    public static void realizeReverse (int[] list) {

        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = temp;
        }
        for (int g : list) {
            System.out.print(g + " ");
        }
    }
}

