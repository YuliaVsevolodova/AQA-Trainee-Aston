import com.sun.tools.javac.Main;

public class Factorial {
    public static int calculateFactorial() {
        int result = 1;
        for (int i = 1; i <= 3; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial());
    }
}
