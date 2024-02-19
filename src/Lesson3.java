import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        sumBetween10and20();
        checkNumber();
        trueOrfalse();
        isLeapYearBool();
        StringPrinter("Hello World", 3);
        exs6();
        exs7();
        exr8();
        exs9();
        exs10();
    }

    public static void sumBetween10and20() {
        int a = 10;
        int b = 10;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void checkNumber() {
        int num = -3;
        if (num >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void trueOrfalse() {
        int a = 10;
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void isLeapYearBool() {
        int a = 400;
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0)) {
                System.out.println("Високосный");
            }
        }
    }

    public static void StringPrinter(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }

    }

    public static void exs6() {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void exs7() {
        int[] arr = new int[100];
        arr[0] = 1;
        System.out.println(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
            System.out.println(arr[i]);
        }
    }

    public static void exs9() {
        int[][] mdarr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    mdarr[i][j] = 1;
                }
                System.out.print(mdarr[i][j]);
            }
            System.out.println();
        }
    }

    public static void exr8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //           2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void exs10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.println("Введие числа массива:");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Ваш массив:");
        for (int i = 0; i < len; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}