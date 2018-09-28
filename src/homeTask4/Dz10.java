package homeTask4;

public class Dz10 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        int j = 1;
        int summ=0;

        System.out.println(ANSI_BLUE+"Члены арифметической прогрессии:  "+ANSI_RESET);
        for(int i = 1; i<=10;i++){
            summ = summ+j;
            System.out.print(j+"  ");
            j = j+4;
        }
        System.out.println(" ");
        System.out.println(ANSI_BLUE+"Сумма членов арифметической прогрессии:  "+ANSI_RESET);
        System.out.println(summ);
    }

}
