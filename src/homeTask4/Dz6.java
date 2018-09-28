package homeTask4;

public class Dz6 {
    public static void main(String[] args) {

        int min = 1;
        int max = 30;

        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max ; j++) {
                for (int l = min; l <= max ; l++) {

                    if(i * i + j * j == l * l ){
                        System.out.println("x = " + i + "\t y = " + j + "\t k = " + l);
                    }
                }
            }
        }

    }
}
