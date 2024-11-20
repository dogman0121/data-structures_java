package lab3;

import java.util.Random;

public class Utils {
    public static int[] generateRandomArray(int size, int start, int end){
        int[] result = new int[size];
        for (int i = 0; i < size; i++)
            result[i] = generateRandomNumber(start, end, 0);
        return result;
    }

    public static int generateRandomNumber(int start, int end, int mode) {
        if (mode == 0)
            return new Random().nextInt(start, end);
        else
            return start + (int) (Math.random() * (end - start));
    }


    public static void printArray(int[] array, int size) {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
