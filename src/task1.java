import java.util.Scanner;

public class task1 {
    public static void m(double x) {
        System.out.println("x=" + Math.round(x) + " f(x)=" + Math.round(f(x)) + " x/f(x)=" + x / f(x));
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }

    public static double f(double n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }

    public static void main(String[] args) {
        m(1);

    }
}