import java.util.Scanner;

public class Dz4 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"Программа вычисляет выражение с введенной с консоли переменной"+ANSI_RESET);
        System.out.println("Введите x ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        double answer = n - (Math.pow(n,3)/factorial(3)) + (Math.pow(n,5)/factorial(5))
                - (Math.pow(n,7)/factorial(7))
                + (Math.pow(n,9)/factorial(9))
                - (Math.pow(n,11)/factorial(11))
                + (Math.pow(n,13)/factorial(13));
        System.out.println("Равно =  "+ answer);
    }

    public static int factorial(int input) {
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result = result * i;

        }
        return result;
    }
}
