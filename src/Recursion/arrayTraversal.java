// Question: Print all the elements of an array

package Recursion;

public class arrayTraversal {
    public static void printArray(int i, int[] arr) {
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(i + 1, arr);
    }
    public static void main(String[] args) {
       int arr[] = {1,4,5,7,23,535,635};
       printArray(0,arr);
    }
}
