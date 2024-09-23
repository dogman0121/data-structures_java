package lab2;

import java.lang.reflect.Array;

public class Utils {
    public static <T> T[] resizeArray(T[] array, int newLength) {
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), newLength);
        if (Math.min(array.length, newLength) >= 0)
            System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newLength));
        return newArray;
    }

    public static <T> void printArray(T[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i].toString() + "\n");
    }
}
