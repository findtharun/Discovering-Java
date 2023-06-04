package Basics.Operators;

public class Operators {
    public static void main(String[] args) {
        // Bitwise Operators

        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1

        System.out.println(a & b); // 0 1 0 0 1
        System.out.println(a | b); // 1 1 1 1 1

        /* xor Operator Provides 1 If both are different else 0 */
        System.out.println(a ^ b); // 1 0 1 1 0
    }
}
