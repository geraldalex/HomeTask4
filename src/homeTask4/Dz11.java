package homeTask4;

public class Dz11 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELOW = "\u001B[33m";
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10;j++){
                System.out.print(ANSI_BLUE+"* "+ANSI_RESET);
            }
            System.out.println("");

        }
        System.out.println("--------------------------------------------------");

        for(int i = 0; i<10;i++){

            for(int j = 0; j<10;j++){
                if(j<=i)
                    System.out.print(ANSI_YELOW+"* "+ANSI_RESET);
            }
            System.out.println("");

        }
        System.out.println("--------------------------------------------------");



        for(int i = 0; i<10;i++){

            for(int p = i; p<10;p++){
                System.out.print(" ");
            }
            for(int j = 0; j<10;j++){
                if(j<=i)
                    System.out.print(ANSI_BLUE+"* "+ANSI_RESET);
            }
            System.out.println("");

        }
        System.out.println("--------------------------------------------------");

        for(int i = 0; i<=10;i++){

            for (int k = 0; k<=10-i;k++){
                System.out.print(" ");
            }

            for(int j = 0; j<=i;j++){
                System.out.print(ANSI_BLUE+"* "+ANSI_RESET);

            }
            System.out.println(" ");

        }

        for(int i = 9; i>=0;i--){

            for (int k = 0; k<=10-i;k++){
                System.out.print(" ");
            }

            for(int j = 0; j<=i;j++){
                System.out.print(ANSI_BLUE+"* "+ANSI_RESET);

            }
            System.out.println(" ");

        }

    }

}
