package homeTask4;

import java.util.Scanner;

public class Dz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Z :  ");

        int Z = sc.nextInt();
        int count = 1;
        int summ = 0;
        int j = 2;

        for (int i = 0; i<=1000000;i++){
            count++;
            j=j+4;
            summ = summ+j;

            if(summ>=Z){
                break;
            }

        }

        System.out.println("------------------------");
        System.out.println("Число слагаемых : "+count);
        System.out.println("Величина суммы : "+summ);
        System.out.println("Последнее слагаемое : "+j);
    }
}
