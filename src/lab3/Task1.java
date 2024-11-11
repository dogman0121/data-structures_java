package lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n;
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0)
                    break;
            }
            System.out.println("Invalid input");
            sc.nextLine();
        }
        int[] v = Utils.generateRandomArray(n, 1, 100);
        Utils.printArray(v, n);
        int[] v1 = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0)
                v1[p++] = v[i];
        }
        Utils.printArray(v1, p);
    }
}
