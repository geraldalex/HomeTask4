import java.util.Scanner;

public class Dz5 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "Программа вычисляет значения функции f(x) на отрезке [a,b] с шагом h" + ANSI_RESET);
        System.out.println("Выберите выражение 1) - F(x)=tgx?" +
                ", 2) - F(x)=ctgx+1");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println(ANSI_BLUE + "Вычисление по формуле : F(x)=tgx" + ANSI_RESET);
            System.out.println("Введите начальное значение : ");
            int a;
            a = sc.nextInt();
            System.out.println("Введите конечное значение : ");
            double b = sc.nextDouble();
            System.out.println("Введите шаг : ");
            double h = sc.nextDouble();
            for (int i = a; i <= b; i += h) {
                double answer = Math.tan(Math.toRadians(i));
                System.out.println("F(x) = " + answer);

            }
        } else if (choice == 2) {
            System.out.println(ANSI_BLUE + "Вычисление по формуле : F(x)=ctgx+1" + ANSI_RESET);
            System.out.println("Введите начальное значение : ");
            int a = sc.nextInt();
            System.out.println("Введите конечное значение : ");
            double b = sc.nextDouble();
            System.out.println("Введите шаг : ");
            double h = sc.nextDouble();
            for (int i = a; i <= b; i += h) {
                double answer = 1 / Math.tan(Math.toRadians(i)) + 1;
                System.out.println("F(x) = " + answer);
            }
        }if (choice!=1&&choice!=2){
            System.out.println("В следующий раз воодите 1 или 2!");
        }

    }


}
