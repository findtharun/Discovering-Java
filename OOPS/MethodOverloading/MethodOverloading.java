class Addition {
    /* Changing Number of Arguments */
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    /* Changing Data Type of Arguments */
    public double add(double a,int b) {
        return a + b ;
    }

}

public class MethodOverloading {
    public static void main(String args[]) {
        Addition obj = new Addition();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1.5, 2));
        System.out.println(obj.add(1, 2, 3));
    }
}