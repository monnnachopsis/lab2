import java.util.Scanner;

public class task4 {
    static double eps = 0.0000001;

    public static double fx(double x) {
        return (Math.pow(x, 3) + 2.5* Math.pow(x, 2) - x - 2.5);
    }
    public static double dfx(double x) {
        return (3 * x * x + 5 * x - 1);
    }
    public static void solveRec(double x0, double x1){
        System.out.println(x1);
        if (Math.abs(x1 - x0) > eps){
            x0 = x1;
            x1 = x0 - fx(x0)/dfx(x0);
            solveRec(x0, x1);
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x0");
        double x0 = sc.nextDouble();
        System.out.println("Нахождение корня с помощью рекурсии");
        double x1 = x0 - fx(x0) / dfx(x0);
        solveRec(x0, x1);
    }
}