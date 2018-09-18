import java.math.BigInteger;

public class Dz1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"Программа выводит в консоль результат умножения числа а = 123456789 на числа 9, 18, 27...81  "+ANSI_RESET);
        int a = 123456789;
        BigInteger bigInteger  = new BigInteger("123456789");
        System.out.println("int"+"\t"+"\t"+"\t"+"\t"+"BigInteger");
        for(int i = 1;i<=9;i++){
            a=a*(9*i);
            bigInteger = bigInteger.multiply(BigInteger.valueOf(9).multiply(BigInteger.valueOf(i)));
            System.out.println(a+ "\t" + "\t"+ bigInteger);
        }

    }
}
