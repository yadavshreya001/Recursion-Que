// Question: Find the number of ways to reach nth stairs if 1 or 2 jumps at a time is allowed

package Recursion;

import java.util.Scanner;

public class NthStair {
    public static int stairPath(int n) {
        if(n <= 2){ // base case
            return n;
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
