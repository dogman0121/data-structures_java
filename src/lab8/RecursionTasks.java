package lab8;

public class RecursionTasks {
    public static void main(String[] args) {
        System.out.println(task3(3, 3));
    }

    public static int task1(int n){
        int ans = 0;

        while (n != 0){
            ans += n % 10;
            n /= 10;
        }

        return ans;
    }

    public static boolean task2(int n){
        int i = 2;
        while(i * i <= n){
            if(n % i == 0){
                return false;
            }
            i += 1;
        }

        return true;
    }

    public static int task3(int k, int s){
        int ans = 0;
        for(int i = (int) Math.pow(10, k-1); i < Math.pow(10, k); i++){
            int m = 0;
            int j = i;
            while(j != 0){
                m += j % 10;
                j /= 10;
            }

            if (m == s)
                ans += 1;
        }
        return ans;
    }
}
