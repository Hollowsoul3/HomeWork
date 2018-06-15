import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        /*
        Задача 24
        for (int a = 1; a <= 100; a++) {
            if (a != 4 && a != 9) {
                System.out.println(a);
            }
        }
        */
        double n = 1;     //Задача 23
        int b=1;
        while (n <= 1000000 ) {
            System.out.println ("День "+b+": "+n);
            n=1+n*3;
            b++;
        }
    }
}
