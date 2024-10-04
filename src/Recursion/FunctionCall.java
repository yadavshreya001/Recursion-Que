package Recursion;
public class FunctionCall {

    public static void mango(){
        System.out.println("I am in mango");
    }
    public static void banana(){
        System.out.println("I am in banana");
        mango();
    }

    public static void apple(){
        banana();
        System.out.println("I am in apple");
        mango();
    }

    public static void main(String[] args) {
        System.out.println("I am in Main method");
        apple();
    }
}
