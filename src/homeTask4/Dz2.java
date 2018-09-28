package homeTask4;

public class Dz2 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"Программа вычисляет значение функции y=ax^2+b рпи à=3, b=-5. Аргумент х принимает значние от 1 до 5 с шагом 0,5"+ANSI_RESET);
        double a = 1;
        double b = 5;
        double h = 0.5;
        for (double i  =a; i<=b;i+=h)
            System.out.println(ANSI_BLUE+a*Math.pow(i,2)+b+ANSI_RESET);

    }

}
