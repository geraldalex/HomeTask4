package homeTask4;

public class Dz8 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"20 первых натуральных чисел, деляхщийся нацело на 13 или на 17, и больших 500 :  "+ANSI_RESET);
        int count=0;
        for(int i = 500;i<=1000;i++){
            if(i%13==0||i%13==0){
                System.out.print(i+ "  ");
                count++;
                if(count==20)
                    break;
            }
        }

    }

}
