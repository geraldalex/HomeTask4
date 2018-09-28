package homeTask4;

public class Dz7 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE+"15 первых натуральных чисел, деляхщийся нацело на 19, и больших 100 :  "+ANSI_RESET);
        int count=0;
        for(int i = 100;i<=1000;i++){
            if(i%19==0){
                System.out.print(i+ "  ");
                count++;
                if(count==15)
                    break;
            }
        }

    }


}
