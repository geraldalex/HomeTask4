package homeTask4;

import java.util.Scanner;

public class Dz3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {

        char a,b;

        System.out.println(ANSI_BLUE+"Дано натуральное число верно ли что цифра а в нем встречается реже чем цифра b "+ANSI_RESET );
        System.out.println(" введите натуральное число :");
        Scanner s = new Scanner( System.in );
        String line = s.nextLine ().trim ();
        System.out.println(" введите а : ");
        char[] r = s.nextLine().toCharArray();
        System.out.println(" введите b : ");
        char[] j = s.nextLine().toCharArray();
        char [] array = line.toCharArray ();
        int counta = 0;
        int countb = 0;

        for (int k = 0; k < r.length; k++) {
            for (int i = 0; i < array.length; i++) {

                if(array[i] ==r[k])
                    counta++;
            }
        }

        for (int k = 0; k < j.length; k++) {
            for (int i = 0; i < array.length; i++) {

                if(array[i] ==j[k])
                    countb++;
            }
        }

        if(counta<countb){
            System.out.println(ANSI_BLUE+"Верно!!!!!!!!!!!!!"+ANSI_RESET);
        }else if(counta>countb)
            System.out.println(ANSI_BLUE+"Не верно!!!!!!!!!!!!!"+ANSI_RESET);
        if(counta==countb)
            System.out.println(ANSI_BLUE+"Одинаковое количество раз!!!!!!!!"+ANSI_RESET);
        System.out.println("цифра а встречается:  "+counta+"\n" +"цифра b встречается:  "+countb );

    }

}
