package lab8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            if (sc.hasNextInt()){
                int n = sc.nextInt();
                if (n > 0) {
                    System.out.println(new Task1().solve(n));
                    break;
                }
            }
            else{
                sc.nextLine();
            }
        }

    }

    public int solve(int n){
        if (n == 0)
            return 0;

        return solve(n / 10) + n % 10;
    }
}
