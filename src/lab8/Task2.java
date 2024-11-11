package lab8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            if (sc.hasNextInt()){
                int n = sc.nextInt();
                if (n > 0) {
                    System.out.println(new Task2().solve(n, 2));
                    break;
                }
            }
            else{
                sc.nextLine();
            }
        }
    }

    public boolean solve(int number, int current) {
        boolean result;
        if (current * current > number) {
            result = true;
        } else if (number % current == 0) {
            result = false;
        } else {
            result = solve(number, current + 1);
        }
        return result;
    }
}
