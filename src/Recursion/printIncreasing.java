// Question: Print 1 to n

package Recursion;
import java.util.Scanner;

                            /*      Method 1: After Recursive call      */

public class printIncreasing {
    static int n; // global variable of n
    static void print1ToN(int n) {
        if(n == 0){                    // base case
            return ;
        }
        print1ToN(n - 1);         // call
        System.out.println(n);      // work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        print1ToN(n);
    }
}

//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------


                         /*      Method 2:  Using Global variable     */
/*
public class printIncreasing {
    static int n; // global variable of n
    static void print1ToN(int x) {
        if(x > n ){
            return ;
        }
        System.out.println(x);
        print1ToN(x+ 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        print1ToN(1);

    }
}
*/

//-------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------



                                /*     Method 3:  Using extra parameter     */
/*

public class printIncreasing {
    static void print1ToN(int x , int n) {
        if(x > n ){
            return ;
        }
        System.out.println(x);
        print1ToN(x+ 1,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        print1ToN(1,n);

    }
}

 */

