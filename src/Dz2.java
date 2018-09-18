public class Dz2 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"Таблица умножения на 7"+ANSI_RESET);
        for(int i = 1;i<=10;i++){
            int b = 7*i;
            System.out.println("7 * "+i+" = "+b);
        }
    }
}
