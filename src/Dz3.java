public class Dz3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"Программа выводит в консоль столбиком sin2, sin3...sin20  "+ANSI_RESET);
        for(int i = 2; i<=20;i++){
            System.out.println("sin "+ i +" = "+ Math.sin(Math.toRadians(i)));
        }
    }
}

