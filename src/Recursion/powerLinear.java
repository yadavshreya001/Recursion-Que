// Question: Make a function which calculates 'a' raised to the power 'b' using recursion 

package Recursion;
import java.util.Scanner;

public class powerLinear {
    public static int pow(int a, int b){
        if(a == 0 && b == 0){  // edge case if base = 0 and power = 0
            System.out.println("Not defined");
            return -1;
        }
        if(b == 0){
            return 1;
        }
        return a * pow(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        System.out.println(base + " raise to the power " + power + " is " +  pow(base, power));
    }
}
