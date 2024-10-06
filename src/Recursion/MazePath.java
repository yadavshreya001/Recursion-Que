/*  Question: Given m*n grid you have to reach from top left corner to bottom right corner.
              You can go either down or right at a time. Find the number of paths ?
*/

package Recursion;
import java.util.Scanner;

public class MazePath {
    public static int maze(int startingRow, int startingCol, int endRow, int endCol ){
        if(startingRow == endRow || startingCol == endCol){
            return 1;
        }
        int rightWays = maze(startingRow, startingCol + 1, endRow, endCol);
        int downWays = maze(startingRow + 1, startingCol, endRow, endCol);
        return rightWays + downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println(maze(1,1,n, m));
    }
}
