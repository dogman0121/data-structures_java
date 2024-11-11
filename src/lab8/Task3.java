package lab8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int k = -1; int s = -1;
        Scanner sc = new Scanner(System.in);
        while(true){
            if (sc.hasNextInt()){
                int n = sc.nextInt();
                if (n < 0)
                    continue;
                if (k == -1){
                    k = n;
                }
                else{
                    s = n;
                    System.out.println(new Task3().solve(k, s));
                    break;
                }
            }
            else{
                sc.nextLine();
            }
        }
    }

    public int solve(int k, int s) {
        if (s == 0 & k != 0)
            return 0;

        if (k == 0 & s != 0)
            return 0;

        if (k == 0 & s == 0)
            return 1;

        int ans = 0;
        for (int i = 0; i <= Math.min(9, s); i++){
            ans += solve(k-1, s-i);
        }
        return ans;
    }
}
