// Question: Print sum of 1 to n

package Recursion;
import java.util.Scanner;

        /*       Method 1: Sum using extra parameter       */
/*
public class Sum1ToN {
    static void sumFrom1ToN(int n, int sum) {
        if(n == 0){
            System.out.println(sum);
            return ;
        }
        sumFrom1ToN(n - 1, sum + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sumFrom1ToN(n,0);
    }
}
 */

//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------


    /*       Method 2: Sum using return type       */

public class Sum1ToN {
    static int sumFrom1ToN(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return n + sumFrom1ToN(n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(sumFrom1ToN(n));
    }
}

