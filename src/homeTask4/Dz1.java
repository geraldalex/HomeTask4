package homeTask4;

import java.util.Scanner;

public class Dz1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "Программа вычисляет значение по формулам f(x) на отрезке [a,b] с шагом h" + ANSI_RESET);
        System.out.println(" выберите формулу 1) - F(x)=x-sinx?" +
                ", 2) - F(x)=sin^2*x" + ", 3) - F(x)=2cosx-1");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println(ANSI_BLUE + " вычисления по формуле : F(x)=x-sinx" + ANSI_RESET);
            System.out.println(" введите перрвое значение а : ");
            double a;
            a = sc.nextDouble();
            System.out.println(" введите второе значение b : ");
            double b = sc.nextDouble();
            System.out.println(" введите шаг h : ");
            double h = sc.nextDouble();

            System.out.printf("%-30s  %-30s\n", "x", "F(x)");
            for (double i = a; i <= b; i += h) {
                double answer = i - Math.sin(i);
                System.out.printf("%-30s  %-30s\n", i, answer);

            }
        }  if (choice == 2) {
            System.out.println(ANSI_BLUE + " вычисления по формуле : F(x)=sin^2*x" + ANSI_RESET);
            System.out.println("  введите перрвое значение а : ");
            double a = sc.nextDouble();
            System.out.println(" введите второе значение b : ");
            double b = sc.nextDouble();
            System.out.println(" введите шаг h : ");
            double h = sc.nextDouble();
            System.out.printf("%-30s  %-30s\n", "x", "F(x)");
            for (double i = a; i <= b; i += h) {
                double answer = Math.pow(Math.sin(i), 2)*i;
                System.out.printf("%-30s  %-30s\n", i, answer);
            }
        }if (choice == 3) {
            System.out.println(ANSI_BLUE + " вычисления по формуле : F(x)=2cosx-1" + ANSI_RESET);
            System.out.println("  введите перрвое значение а : ");
            double a = sc.nextDouble();
            System.out.println(" введите второе значение b : ");
            double b = sc.nextDouble();
            System.out.println(" введите шаг h : ");
            double h = sc.nextDouble();
            System.out.printf("%-30s  %-30s\n", "x", "F(x)");
            for (double i = a; i <= b; i += h) {
                double answer = 2*Math.cos(i) - 1;
                System.out.printf("%-30s  %-30s\n", i, answer);
            }
        }if (choice!=1&&choice!=2&&choice!=3){
            System.out.println("  в следующий раз введите  1, 2 или 3!");
        }

    }

}
