import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        /*
        for (int a = 1; a <= 100; a++) {
            if (a != 4 && a != 9) {
                System.out.println(a);
            }
        }
        */
        double n = 1;
        int b=1;
        while (n <= 1000000 ) {
            System.out.println ("День "+b+": "+n);
            n=1+n*3;
            b++;
        }
    }
}
