// Question: Find the number of ways to reach nth stairs if 1 or 2 jumps at a time is allowed

package Recursion;

import java.util.Scanner;

public class NthStair {
    public static int stairPath(int n) {
       // Base cases
        if (n == 0) {
            return 1;  // Stay on the ground
        }
        if (n == 1) {
            return 1;  // One 1-step jump to reach stair 1
        }
        if (n == 2) {
            return 2;  // Two ways to reach stair 2 (1+1 or 2)
        }   
        return stairPath(n - 1) + stairPath(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println(stairPath(n));
    }
}
