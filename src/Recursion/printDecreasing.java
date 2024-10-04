// Question: Print n to 1

package Recursion;
import java.util.Scanner;

public class printDecreasing {
    static void printNTo1(int n){
        if(n == 0) {
            return ;
        }
        System.out.println(n);
        printNTo1(n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        printNTo1((n));
    }
}
