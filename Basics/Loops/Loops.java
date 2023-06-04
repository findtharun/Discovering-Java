package Basics.Loops;

class Loops {
    public static void main(String args[]) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // If the requirement is executing atleast once even if the condition fails
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        for(int j = 0; j <= 10; j++)
        {
            System.out.println(j);
        }
    }
}