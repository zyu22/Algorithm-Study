import java.util.*;

public class Main {
    static int[] cards;
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        cards = new int[n + 1];
        dp = new Integer[n + 1];

        dp[0] = 0;
        dp[1] = 0;
        for (int i = n; i >= 1; i--) {
            cards[i] = sc.nextInt();
        }
        if (n >= 2) {
            dp[2] = countOneBit(cards[1] ^ cards[2]);
            if (n >= 3) dp[3] = countOneBit(cards[1] ^ cards[2] ^ cards[3]);
            if (n >= 4) dp[4] = countOneBit(cards[3] ^ cards[4]) + dp[2];
        }
        for (int i = 5; i <= n; i++) {
            int xor1 = cards[i - 1] ^ cards[i];
            int xor2 = cards[i - 1] ^ cards[i - 2] ^ cards[i];
            dp[i] = Math.max(dp[i - 2] + countOneBit(xor1), dp[i - 3] + countOneBit(xor2));
        }
        System.out.println(dp[n]);
    }
    
    public static int countOneBit(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
