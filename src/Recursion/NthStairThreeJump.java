// Question: Find the number of ways to reach nth stairs if 1,2 or 3 jumps at a time is allowed

package Recursion;
import java.util.Scanner;

public class NthStairThreeJump {
    public static int threeJumpNthStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return threeJumpNthStairs(n - 1) + threeJumpNthStairs(n - 2) + threeJumpNthStairs(n - 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println(threeJumpNthStairs(n));
    }
}
