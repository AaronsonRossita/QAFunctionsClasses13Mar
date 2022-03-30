package math;

public class Calculator {

    int a; // default
    public int b;
    protected int c;
    private int d;

    public final static String className = "This class is a Calculator";

    private Calculator() {
    }

    public static int sum(int a, int b){
        return a + b;
    }
    // {1,2,3}
    public static int sum(int[] arr){
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int mult(int[] arr){
        int temp = 1;
        for (int number : arr){
            temp *= number;
        }
        return temp;
    }
    // 3^2 = 3 * 3
    // 3^3 = (3 * 3) * 3
    // 3^4 = ((3 * 3) * 3) * 3
    public static int power(int number, int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}

