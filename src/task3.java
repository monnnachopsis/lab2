import java.util.Scanner;

public class task3 {
    public static Scanner sc;
    public static int[] mas;
    public static void zM(int i){
        if(i < mas.length){
            System.out.println("Введите " + i + "-й элемент");
            mas[i] = sc.nextInt();
            zM(++i);
        }
    }
    public static void vM(int k){
        if(k < mas.length){
            System.out.println(mas[k]);
            vM(++k);
        }
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("введите количество целых чисел в массиве");
        int n = sc.nextInt();
        mas = new int[n];
        zM(0);
        System.out.println("элементы массива:");
        vM(0);
    }
}